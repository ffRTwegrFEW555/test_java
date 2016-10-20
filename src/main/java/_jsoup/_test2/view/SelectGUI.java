package _jsoup._test2.view;

import _jsoup._test2.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by USER on 20.10.2016.
 */
public class SelectGUI {
    public static void selectionGUI() {
        JFrame selectGUIFrame = new JFrame("Select GUI");

        // set window decoration style
        selectGUIFrame.setResizable(false);

        // size and on close operation
        selectGUIFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        selectGUIFrame.setSize(500, 300);

        // create a form in the middle of the screen.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        selectGUIFrame.setLocation(
                screenSize.width / 2 - (int) selectGUIFrame.getSize().getWidth() / 2,
                screenSize.height / 2 - (int) selectGUIFrame.getSize().getHeight() / 2);

        // add buttons
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(buttonBox);

        selectGUIFrame.setLayout(new BorderLayout());
        selectGUIFrame.add(BorderLayout.CENTER, buttonsPanel);
        selectGUIFrame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton swingButton = new JButton("Swing GUI");
        swingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGUI(selectGUIFrame, 0);
            }
        });
        buttonBox.add(swingButton);

        // the horizontal distance
        buttonBox.add(Box.createHorizontalStrut(20));

        JButton javaFXButton = new JButton("JavaFX GUI");
        javaFXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGUI(selectGUIFrame, 1);
            }
        });
        buttonBox.add(javaFXButton);

        // show frame
        selectGUIFrame.pack();
        selectGUIFrame.setVisible(true);
    }

    private static void startGUI(JFrame frame, int gui) {
        frame.setVisible(false);
        frame.dispose();
        new Controller(gui);
    }
}
