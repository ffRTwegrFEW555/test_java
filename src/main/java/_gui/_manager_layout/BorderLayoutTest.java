package _gui._manager_layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 04.06.2016.
 */
public class BorderLayoutTest {
    public static void main(String[] args) {

        //
        BorderLayoutTest borderLayoutEast = new BorderLayoutTest();
        BorderLayoutTest borderLayoutEastText = new BorderLayoutTest();
        BorderLayoutTest borderLayoutNorth = new BorderLayoutTest();
        BorderLayoutTest borderLayoutNorthText = new BorderLayoutTest();
        BorderLayoutTest borderLayoutAll = new BorderLayoutTest();

        //
        borderLayoutEast.goEast();
        borderLayoutEastText.goEastText();
        borderLayoutNorth.goNorth();
        borderLayoutNorthText.goNorthText();
        borderLayoutAll.goAll();

    }

    public void goEast() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click me");
        jFrame.getContentPane().add(BorderLayout.EAST, jButton);
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
    }

    public void goEastText() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click like you mean it");
        jFrame.getContentPane().add(BorderLayout.EAST, jButton);
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
    }

    public void goNorth() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("There is no spoon...");
        jFrame.getContentPane().add(BorderLayout.NORTH, jButton);
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
    }

    public void goNorthText() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        jButton.setFont(bigFont);
        jFrame.getContentPane().add(BorderLayout.NORTH, jButton);
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
    }

    public void goAll() {
        JFrame jFrame = new JFrame();

        JButton north = new JButton("North");
        JButton west = new JButton("West");
        JButton south = new JButton("South");
        JButton east = new JButton("East");
        JButton center = new JButton("Center");

        jFrame.getContentPane().add(BorderLayout.NORTH, north);
        jFrame.getContentPane().add(BorderLayout.WEST, west);
        jFrame.getContentPane().add(BorderLayout.SOUTH, south);
        jFrame.getContentPane().add(BorderLayout.EAST, east);
        jFrame.getContentPane().add(BorderLayout.CENTER, center);

        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
