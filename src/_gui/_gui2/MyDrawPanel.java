package _gui._gui2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Vad on 30.05.2016.
 */
class MyDrawPanel extends JPanel {

    int x2 = 500;
    int y2 = 200;
    int ovalSizeWidth = 100;
    int ovalSizeHeight = 100;
    boolean x2Sign;
    boolean y2Sign;

    int x2Gradient = 500;
    int y2Gradient = 200;
    boolean x2SignGradient;
    boolean y2SignGradient;

    int xCat = 10;
    int yCat = 10;
    boolean xCatSign;
    boolean yCatSign;

    //
    Image image = new ImageIcon("c:/cat1.jpg").getImage();
    FlyingCat flyingCatzzz;
    Thread flyingCat;

    public void paintComponent(Graphics g) {
        //
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        //
        g.setColor(Color.ORANGE);
        g.fillRect(20, 50, 100, 100);

        //
        g.setColor(Color.CYAN);
        g.draw3DRect(100, 100, 100, 100, false);

        //
        g.setColor(Color.BLUE);
        g.fill3DRect(200, 200, 200, 200, true);

        //
        int x = 200;
        int y = 200;
        for (int i = 0; i < 5; i++) {
            Image image = new ImageIcon("c:/cat1.jpg").getImage();
            g.drawImage(image, x = x + 50, y += 50, this);
            System.out.println(x + " " + y);
        }

        //
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(x2Sign ? x2-- : x2++, y2Sign ? y2-- : y2++, ovalSizeWidth, ovalSizeHeight);

        if (x2 + ovalSizeWidth >= this.getWidth())
            x2Sign = true;
        else if (x2 <= 0)
            x2Sign = false;

        if (y2 + ovalSizeHeight >= this.getHeight())
            y2Sign = true;
        else if (y2 <= 0)
            y2Sign = false;

        //
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.BLACK, this.getWidth(), this.getHeight(), Color.WHITE);
        g2d.setPaint(gradientPaint);
        g.fillOval(x2SignGradient ? (x2Gradient += 2) : (x2Gradient -= 2), y2SignGradient ? (y2Gradient += 2) : (y2Gradient -= 2), 50, 50);

        if (x2Gradient + 50 >= this.getWidth())
            x2SignGradient = false;
        else if (x2Gradient <= 0)
            x2SignGradient = true;

        if (y2Gradient + 50 >= this.getHeight())
            y2SignGradient = false;
        else if (y2Gradient <= 0)
            y2SignGradient = true;

        //
        g.drawImage(image, xCatSign ? xCat-- : xCat++, yCatSign ? yCat-- : yCat++, this);

        if (xCat + image.getWidth(this) >= this.getWidth())
            xCatSign = true;
        else if (xCat <= 0)
            xCatSign = false;

        if (yCat + image.getHeight(this) >= this.getHeight())
            yCatSign = true;
        else if (yCat <= 0)
            yCatSign = false;

        //
        if (flyingCatzzz == null)
            flyingCatzzz = new FlyingCat(g, g2d, xCat, yCat, xCatSign, yCatSign, image, this);

        if (flyingCat == null)
            flyingCat = new Thread(flyingCatzzz);

        if (!flyingCat.isAlive())
            flyingCat.start();

    }

}
