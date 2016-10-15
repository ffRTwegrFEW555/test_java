package __tutorial._quiz_card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Vad on 06.06.2016.
 */
public class QuizCardPlayer {

    //
    private JFrame jFrame;
    private JTextArea jTextAreaDisplay;
    private JButton jButtonShowAnswer;

    private boolean isShowAnswer;

    //
    private ArrayList<QuizCard> quizCardArrayList;
    private QuizCard quizCardCurrent;
    private int currentCardIndex;

    //
    public static void main(String[] args) {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();
    }

    public void go() {
        //
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        //
        MidiFromFile.PlayMidi();

        //
        jFrame = new JFrame("Quiz Card Player");
        JPanel jPanelMain = new JPanel();
        quizCardArrayList = new ArrayList<>();

        //
        Font fontBig = new Font("sanserif", Font.BOLD, 24);
        jTextAreaDisplay = new JTextArea(10, 20);
        jTextAreaDisplay.setFont(fontBig);
        jTextAreaDisplay.setLineWrap(true);
        jTextAreaDisplay.setEditable(false);

        JScrollPane jScrollPaneDisplay = new JScrollPane(jTextAreaDisplay);
        jScrollPaneDisplay.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPaneDisplay.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //
        jButtonShowAnswer = new JButton("Show Question");
        jButtonShowAnswer.addActionListener(new NextCardListener());

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("File");
        JMenuItem jMenuItemLoad = new JMenuItem("Load card set");
        jMenuItemLoad.addActionListener(new OpenMenuListener());

        jMenu.add(jMenuItemLoad);
        jMenuBar.add(jMenu);

        jPanelMain.add(jScrollPaneDisplay);
        jPanelMain.add(jButtonShowAnswer);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(jPanelMain);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);
    }

    private class NextCardListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isShowAnswer) {
                jTextAreaDisplay.setText(quizCardCurrent.getAnswer());
                jButtonShowAnswer.setText("Next Card");
                isShowAnswer = false;
            }
            else {
                if (currentCardIndex < quizCardArrayList.size()) {
                    showNextCard();
                }
                else {
                    jTextAreaDisplay.setText("That was last Card");
                    jButtonShowAnswer.setEnabled(false);
                }
            }
        }
    }

    private class OpenMenuListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showOpenDialog(jFrame);
            loadFile(jFileChooser.getSelectedFile());
        }
    }

    private void loadFile(File selectedFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                makeCard(line);
            }
            bufferedReader.close();

            jButtonShowAnswer.setText("Show Question");
            jButtonShowAnswer.setEnabled(true);
            jTextAreaDisplay.setText("");
            isShowAnswer = false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void makeCard(String line) {
        String[] result = line.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        quizCardArrayList.add(card);
        System.out.println("made a card");
    }

    private void showNextCard() {
        quizCardCurrent = quizCardArrayList.get(currentCardIndex);
        currentCardIndex++;
        jTextAreaDisplay.setText(quizCardCurrent.getQuestion());
        jButtonShowAnswer.setText("Show Answer");
        isShowAnswer = true;
    }
}
