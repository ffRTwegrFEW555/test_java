package _gui._manager_layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 04.06.2016.
 */
public class BoxLayoutTest {
    public static void main(String[] args) {

        //
        BoxLayoutTest boxLayoutTest1 = new BoxLayoutTest();
        BoxLayoutTest boxLayoutTest2 = new BoxLayoutTest();
        BoxLayoutTest boxLayoutTest3 = new BoxLayoutTest();

        //
        boxLayoutTest1.go1();
        // boxLayoutTest2.go2();
        // boxLayoutTest3.go3();
    }

    public void go1() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");
        JButton jButton2 = new JButton("bliss");
        JButton jButton3 = new JButton("huh?");

        jPanel.setBackground(Color.GRAY);
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }

    public void go2() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");
        JButton jButton2 = new JButton("bliss");
        JButton jButton3 = new JButton("huh?");

        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }

    public void go3() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");
        JButton jButton2 = new JButton("bliss");
        JButton jButton3 = new JButton("huh?");

        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }
}
