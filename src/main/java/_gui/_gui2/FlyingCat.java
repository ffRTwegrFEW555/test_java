package _gui._gui2;

import java.awt.*;

/**
 * Created by Vad on 30.05.2016.
 */
public class FlyingCat
        implements Runnable {
    private Graphics g;
    private Graphics g2d;
    private int xCat;
    private int yCat;
    private boolean xCatSign;
    private boolean yCatSign;
    private Image image;
    private MyDrawPanel myDrawPanel;

    public FlyingCat(Graphics g, Graphics g2d, int xCat, int yCat, boolean xCatSign, boolean yCatSign, Image image, MyDrawPanel myDrawPanel) {
        this.g = g;
        this.g2d = g2d;
        this.xCat = xCat;
        this.yCat = yCat;
        this.xCatSign = xCatSign;
        this.yCatSign = yCatSign;
        this.image = image;
        this.myDrawPanel = myDrawPanel;
    }

    @Override
    public void run() {
        while (true) {
            try {
                myDrawPanel.updateUI();
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
