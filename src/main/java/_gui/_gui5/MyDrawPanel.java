package _gui._gui5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 01.06.2016.
 */
public class MyDrawPanel
        extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(200, 200, 100, 100);
    }
}
