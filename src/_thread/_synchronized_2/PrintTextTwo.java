package _thread._synchronized_2;

import java.util.ArrayList;

/**
 * Created by USER on 22.09.2016.
 */
public class PrintTextTwo extends PrintText {
    private final ArrayList<String> arrayList = new ArrayList<>();

    public void printText() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("printText:      " + Thread.currentThread().getName());
            }
        }
    }

    public void printTextTwo() {
        synchronized (arrayList) {
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
}
