package _thread._synchronized_2;

/**
 * Created by USER on 22.09.2016.
 */
public class ЗадачаДляПотока implements Runnable {
    private PrintText printText;
    private static boolean select;

    public ЗадачаДляПотока(PrintText printText) {
        this.printText = printText;
    }

    @Override
    public void run() {
        select = !select;

        if (select) {
            printText.printText();
        } else {
            printText.printTextTwo();
        }
    }
}
