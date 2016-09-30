package _gui._gui4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vad on 01.06.2016.
 */
public class SimpleGui1C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui1C gui = new SimpleGui1C();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change color");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

}
