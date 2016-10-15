package __tutorial._quiz_card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Vad on 06.06.2016.
 */
public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go() {
        //
        try {
            // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // UIManager.setLookAndFeel(new com.sun.java.swing.plaf.motif.MotifLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        frame = new JFrame("Quiz Card Builder");
        cardList = new ArrayList<>();
        JPanel mainPanel = new JPanel();
        JLabel qLabel = new JLabel("Question:");
        JLabel aLabel = new JLabel("Answer:");

        //
        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        question = new JTextArea(6, 20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScroller = new JScrollPane(question);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //
        answer = new JTextArea(6, 20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        //
        JButton nextButton = new JButton("Next card");
        nextButton.addActionListener(new NextCardListener());

        //
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        JMenu lookAndFeelMenu = new JMenu("LookAndFeel");
        JMenuItem metalMenuItem = new JMenuItem("Metal");
        JMenuItem systemMenuItem = new JMenuItem("System");
        JMenuItem motifMenuItem = new JMenuItem("Motif");
        JMenuItem gtkMenuItem = new JMenuItem("GTK");

        newMenuItem.addActionListener(new NewMenuListener());
        saveMenuItem.addActionListener(new SaveMenuListener());

        metalMenuItem.addActionListener(new LookAndFeelMenuListener());
        systemMenuItem.addActionListener(new LookAndFeelMenuListener());
        motifMenuItem.addActionListener(new LookAndFeelMenuListener());
        gtkMenuItem.addActionListener(new LookAndFeelMenuListener());

        //
        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        lookAndFeelMenu.add(metalMenuItem);
        lookAndFeelMenu.add(systemMenuItem);
        lookAndFeelMenu.add(motifMenuItem);
        lookAndFeelMenu.add(gtkMenuItem);
        menuBar.add(lookAndFeelMenu);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(mainPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }

    private class NextCardListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    private class NewMenuListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            cardList.clear();
            clearCard();
        }
    }

    private class SaveMenuListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);

            //
            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile(fileSave.getSelectedFile());
        }
    }

    private void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    private void saveFile(File file) {
        try {

            //
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(QuizCard quizCard : cardList) {
                bufferedWriter.write(quizCard.getQuestion() + "/");
                bufferedWriter.write(quizCard.getAnswer() + "\r\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("couldn't write the cardList out");
            e.printStackTrace();
        }
    }

    private class LookAndFeelMenuListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // it's not work! need to correct.
            System.out.println("Error :(");
        }
    }
}
