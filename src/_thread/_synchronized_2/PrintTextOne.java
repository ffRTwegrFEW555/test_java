package _thread._synchronized_2;

/**
 * Created by USER on 22.09.2016.
 */
public class PrintTextOne extends PrintText {
    public synchronized void printText() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("printText:      " + Thread.currentThread().getName());
        }
    }

    public synchronized void printTextTwo() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("printTextTwo:   " + Thread.currentThread().getName());
        }
    }
}
