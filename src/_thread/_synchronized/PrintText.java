package _thread._synchronized;

/**
 * Created by USER on 21.09.2016.
 */
public class PrintText implements Runnable {
    private int way;
    private static Point point = new Point();

    public PrintText(int way) {
        if (way < 1 || way > 2) {
            this.way = 1;
        }

        this.way = way;
    }

    @Override
    public void run() {
        if (way == 1) {
            point.textToConsole();
        }
        else {
            point.textToConsoleSynchronized();
        }
    }
}
