package _gui._gui2;

import javax.swing.*;

/**
 * Created by Vad on 29.05.2016.
 */
public class SimpleGui1C {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);

        frame.getContentPane().add(new MyDrawPanel());

        frame.setVisible(true);
    }
}

