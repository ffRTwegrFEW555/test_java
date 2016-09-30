package _gui._gui6;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 02.06.2016.
 */
public class AnimationClass {
    private JFrame jFrame;

    private int x;
    private int y;

    private int sizeA;

    public static void main(String[] args) {
        AnimationClass animationClass = new AnimationClass();
        animationClass.go();
    }

    private void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);

        MyDrawPanel myDrawPanel = new MyDrawPanel();
        myDrawPanel.setSize(200, 200); /* ?!?! */
        jFrame.getContentPane().add(myDrawPanel);

        jFrame.setVisible(true);


        // Блять нихуя не пойму, почему myDrawPanel -- меньшего размера, чем надо!?
        for (; x <= myDrawPanel.getHeight() - sizeA; x++, y++, sizeA++) {
            myDrawPanel.repaint();
            System.out.println("x: " + x + ",   y: " + y + ",   sizeA: " + sizeA);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, jFrame.getWidth(), jFrame.getHeight());

            g.setColor(Color.ORANGE);
            g.fillOval(x, y, sizeA, sizeA);
        }
    }
}
