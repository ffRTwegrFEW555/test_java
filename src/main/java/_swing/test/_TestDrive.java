package _swing.test;

import javax.swing.*;
import java.awt.*;

/**
 * Created by USER on 24.10.2016, 13:12.
 */
public class _TestDrive {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Box rowOne = new Box(BoxLayout.Y_AXIS);
        rowOne.add(new JLabel("Username"));
        rowOne.add(Box.createRigidArea(new Dimension(20,20)));

        rowOne.add(new JTextField());
        Component rowTwo = Box.createVerticalStrut(2);

        f.add(rowOne, BorderLayout.NORTH);
        f.add(rowTwo, BorderLayout.SOUTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
