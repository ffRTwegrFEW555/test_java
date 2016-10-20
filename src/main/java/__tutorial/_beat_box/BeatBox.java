package __tutorial._beat_box;

import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Vad on 04.06.2016.
 */
public class BeatBox {
    //
    String userName;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    HashMap<String, Object[]> otherSeqsMap = new HashMap<>();
    Vector<String> namesToShow = new Vector<>();
    int nextNum;
    JCheckBox appendMusic;

    //
    JFrame theFrame;
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxArrayList = new ArrayList<>();
    JList incomingList;
    JTextField userMessage;

    //
    Sequencer sequencer;
    Sequence sequence;
    Track track;

    //
    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
            "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
            "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    //
    float tempoFactor;
    long tickPosition;
    boolean alreadyPlayed;

    public static void main(String[] args) {
        new BeatBox().startUp(args.length == 0 ? "Unnamed" + (int) (Math.random() * 100) : args[0]);
    }

    public void startUp(String userName) {
        this.userName = userName;
        setUpNetwork();
        setUpMidi();
        buildGUI();
    }

    public void setUpNetwork() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            Thread remote = new Thread(new RemoteReader());
            remote.start();
        } catch (IOException e) {
            System.out.println("couldn't connect - you'll have to play alone.");
        }

    }

    public void buildGUI() {
        //
        try {
            // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // UIManager.setLookAndFeel(new com.sun.java.swing.plaf.motif.MotifLookAndFeel());
            UIManager.LookAndFeelInfo[] infoArray =
                    UIManager.getInstalledLookAndFeels();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        BorderLayout layout = new BorderLayout();
        JPanel backgroundPanel = new JPanel(layout);
        backgroundPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        JButton buttonStart = new JButton("Start");
        buttonStart.addActionListener(new MyStartListener());
        buttonBox.add(buttonStart);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonStop = new JButton("Stop");
        buttonStop.addActionListener(new MyStopListener());
        buttonBox.add(buttonStop);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonTempoUp = new JButton("Tempo Up");
        buttonTempoUp.addActionListener(new MyTempoUpListener());
        buttonBox.add(buttonTempoUp);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonTempoDown = new JButton("Tempo Down");
        buttonTempoDown.addActionListener(new MyTempoDownListener());
        buttonBox.add(buttonTempoDown);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonAllCheckBoxesOff = new JButton("Check Boxes Off");
        buttonAllCheckBoxesOff.addActionListener(new MyAllCheckBoxesOffListener());
        buttonBox.add(buttonAllCheckBoxesOff);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonAllCheckBoxesRandom = new JButton("Check Boxes Random");
        buttonAllCheckBoxesRandom.addActionListener(new MyAllCheckBoxesRandomListener());
        buttonBox.add(buttonAllCheckBoxesRandom);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonSerializeIt = new JButton("Serialize It");
        buttonSerializeIt.addActionListener(new MySerializeItListener());
        buttonBox.add(buttonSerializeIt);
        buttonBox.add(Box.createVerticalStrut(5));

        JButton buttonRestore = new JButton("Restore");
        buttonRestore.addActionListener(new MyRestoreListener());
        buttonBox.add(buttonRestore);
        buttonBox.add(Box.createVerticalStrut(5));

        //
        incomingList = new JList();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        buttonBox.add(Box.createVerticalStrut(5));
        incomingList.setListData(namesToShow);

        //
        userMessage = new JTextField(40);
        buttonBox.add(userMessage);
        buttonBox.add(Box.createVerticalStrut(5));

        //
        JButton buttonSend = new JButton("Send");
        buttonSend.addActionListener(new MySendListener());
        buttonBox.add(buttonSend);
        buttonBox.add(Box.createVerticalStrut(5));

        //
        appendMusic = new JCheckBox("Append track");
        buttonBox.add(appendMusic);
        buttonBox.add(Box.createVerticalStrut(5));

        //
        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        //
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);

        mainPanel = new JPanel(grid);

        for (int i = 0; i < 256; i++) {
            JCheckBox jCheckBox = new JCheckBox();
            jCheckBox.setSelected(false);
            jCheckBox.addActionListener(new MyCheckBoxListener());
            checkBoxArrayList.add(jCheckBox);
            mainPanel.add(jCheckBox);
        }

        //
        backgroundPanel.add(BorderLayout.WEST, nameBox);
        backgroundPanel.add(BorderLayout.EAST, buttonBox);
        backgroundPanel.add(BorderLayout.CENTER, mainPanel);

        theFrame.getContentPane().add(backgroundPanel);
        theFrame.setBounds(100, 100, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public MidiEvent makeEvent (int comd, int chan, int one, int two, int tick) {
        ShortMessage shortMessage = new ShortMessage();
        try {
            shortMessage.setMessage(comd, chan, one, two);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

        return new MidiEvent(shortMessage, tick);
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    public void buildTrackAndStart(long tickPosition, float tempoFactor) {
        int[] trackList;

        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];

            for (int j = 0; j < 16; j++) {
                if (checkBoxArrayList.get(j + (16 * i)).isSelected())
                    trackList[j] = instruments[i];
                else
                    trackList[j] = 0;
            }

            makeTracks(trackList);
            track.add(makeEvent(176, 1, 127, 0, 16));
        }

        track.add(makeEvent(192, 9, 1, 0, 15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTickPosition(tickPosition);
            sequencer.setTempoFactor(tempoFactor);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public void startPlayAgain() {
        stopPlay();
        buildTrackAndStart(tickPosition, tempoFactor);
        alreadyPlayed = true;
    }

    public void stopPlay() {
        tempoFactor = sequencer.getTempoFactor();
        tickPosition = sequencer.getTickPosition();
        sequencer.stop();
    }

    public void changeSequence(boolean[] checkBoxState) {
        for (int i = 0; i < 256; i++) {
            JCheckBox checkBox = checkBoxArrayList.get(i);
            if (checkBoxState[i])
                checkBox.setSelected(true);
            else
                checkBox.setSelected(checkBoxArrayList.get(i).isSelected() && appendMusic.isSelected());
        }
    }

    private class MyStopListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stopPlay();
            alreadyPlayed = false;
        }
    }

    private class MyTempoUpListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.setTempoFactor((float) (sequencer.getTempoFactor() * 1.03));
            tempoFactor = sequencer.getTempoFactor();
        }
    }

    private class MyTempoDownListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.setTempoFactor((float) (sequencer.getTempoFactor() * .97));
            tempoFactor = sequencer.getTempoFactor();
        }
    }

    private class MyCheckBoxListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stopPlay();
            if (alreadyPlayed)
                startPlayAgain();
        }
    }

    private class MyAllCheckBoxesOffListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(JCheckBox jCheckBox : checkBoxArrayList) {
                jCheckBox.setSelected(false);
            }
            stopPlay();
            alreadyPlayed = false;
        }
    }

    private class MyAllCheckBoxesRandomListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(JCheckBox jCheckBox : checkBoxArrayList) {
                jCheckBox.setSelected(Math.random() > 0.9);
            }
            if (alreadyPlayed)
                startPlayAgain();
        }
    }

    private class MySerializeItListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean[] checkBoxState = new boolean[256];

            for (int i = 0; i < 256; i++) {
                if (checkBoxArrayList.get(i).isSelected())
                    checkBoxState[i] = true;
            }

            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(theFrame);

            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(jFileChooser.getSelectedFile()));
                objectOutputStream.writeObject(checkBoxState); /* boolean[] */
                objectOutputStream.writeObject(sequencer.getTempoFactor()); /* float */
                objectOutputStream.writeObject(sequencer.getTickPosition()); /* long */
                objectOutputStream.close(); /* Вроде должен сам закрываться? */
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    private class MyRestoreListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean[] checkBoxState = null;

            JFileChooser jFileChooser = new JFileChooser();

            if (jFileChooser.showOpenDialog(theFrame) == JFileChooser.CANCEL_OPTION)
                return;

            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(jFileChooser.getSelectedFile()));
                checkBoxState = (boolean[]) objectInputStream.readObject();
                tempoFactor = (float) objectInputStream.readObject();
                tickPosition = (long) objectInputStream.readObject();
                objectInputStream.close();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

            for (int i = 0; i < checkBoxState.length; i++) {
                checkBoxArrayList.get(i).setSelected(checkBoxState[i]);
            }

            sequencer.stop();
            if (alreadyPlayed) {
                buildTrackAndStart(tickPosition, tempoFactor);
                alreadyPlayed = true;
            }
        }
    }

    private class MyStartListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (alreadyPlayed)
                buildTrackAndStart(tickPosition, tempoFactor);
            else
                buildTrackAndStart(0, tempoFactor);

            alreadyPlayed = true;
        }
    }

    public class RemoteReader implements Runnable {
        boolean[] checkboxState = null;
        String nameToShow = null;
        Object object = null;

        @Override
        public void run() {
            try {
                while((object = ois.readObject()) != null) {
                    System.out.println("got an object from server");
                    nameToShow = (String) object;
                    System.out.println("nameToShow: " + nameToShow);
                    System.out.println("");

                    System.out.println("tempoFactor before: " + tempoFactor);
                    System.out.println("tickPosition before: " + tickPosition);

                    checkboxState = (boolean[]) ois.readObject();

                    System.out.println("tempoFactor after: " + tempoFactor);
                    System.out.println("tickPosition after: " + tickPosition);

                    System.out.println("");

                    otherSeqsMap.put(nameToShow, new Object[]{checkboxState, ois.readObject(), ois.readObject()});
                    namesToShow.add(nameToShow);
                    incomingList.setListData(namesToShow);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyListSelectionListener
            implements javax.swing.event.ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                String selected = (String) incomingList.getSelectedValue();
                if (selected != null) {
                    boolean[] selectedState = (boolean[]) otherSeqsMap.get(selected)[0];
                    tempoFactor = (float) otherSeqsMap.get(selected)[1];
                    tickPosition = (long) otherSeqsMap.get(selected)[2];
                    changeSequence(selectedState);

                    System.out.println(tempoFactor);
                    System.out.println(tickPosition);

                    sequencer.stop();
                    if (alreadyPlayed) {
                        buildTrackAndStart(tickPosition, tempoFactor);
                        alreadyPlayed = true;
                    }
                }
            }
        }
    }

    private class MySendListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean[] checkBoxState = new boolean[256];
            for (int i = 0; i < 256; i++) {
                JCheckBox checkBox = checkBoxArrayList.get(i);
                if (checkBox.isSelected())
                    checkBoxState[i] = true;
            }

            Float tempF = tempoFactor;
            Long tickP = tickPosition;

            try {
                oos.writeObject(userName + " ( #" + nextNum++ + " ): " + userMessage.getText());
                oos.writeObject(checkBoxState);
                oos.writeObject(tempF);
                oos.writeObject(tickP);
            } catch (IOException e1) {
                System.out.println("Sorry dude. Could not send it to the server.");
            }
            userMessage.setText("");
        }
    }
}
