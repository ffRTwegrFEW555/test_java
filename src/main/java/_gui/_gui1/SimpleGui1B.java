package _gui._gui1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vad on 29.05.2016.
 */
public class SimpleGui1B
        implements ActionListener {
    private JButton button;
    private boolean temp;
    private int countPress;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (temp) {
            button.setText("Click me" + " " + "(I was pressed " + ++countPress + " times)");
            temp = false;
        }
        else {
            button.setText("I've been clicked at!" + " " + "(I was pressed " + ++countPress + " times)");
            temp = true;
        }
    }


}
