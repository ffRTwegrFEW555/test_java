package _gui._manager_layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 04.06.2016.
 */
public class FlowLayoutTest {
    public static void main(String[] args) {

        //
        FlowLayoutTest flowLayoutTest1 = new FlowLayoutTest();
        FlowLayoutTest flowLayoutTest2 = new FlowLayoutTest();
        FlowLayoutTest flowLayoutTest3 = new FlowLayoutTest();
        FlowLayoutTest flowLayoutTest4 = new FlowLayoutTest();
        FlowLayoutTest flowLayoutTest5 = new FlowLayoutTest();

        //
        flowLayoutTest1.go1();
        flowLayoutTest2.go2();
        flowLayoutTest3.go3();
        flowLayoutTest4.go4();
        flowLayoutTest5.go5();

    }

    public void go1() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        jPanel.setBackground(Color.GRAY);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }

    public void go2() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");

        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }

    public void go3() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");
        JButton jButton2 = new JButton("bliss");

        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);
        jPanel.add(jButton2);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }

    public void go4() {
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

    public void go5() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("shock me");
        JButton jButton2 = new JButton("bliss");
        JButton jButton3 = new JButton("akuna-mata-ta!");

        jPanel.setBackground(Color.GRAY);
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButton3);

        jFrame.getContentPane().add(BorderLayout.EAST, jPanel);
        jFrame.setSize(250, 200);
        jFrame.setVisible(true);
    }
}
