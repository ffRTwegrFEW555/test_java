package _thread._synchronized;

/**
 * Created by USER on 22.09.2016.
 */
public class Point {
    public void textToConsole() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName());
        }
    }

    public synchronized void textToConsoleSynchronized() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName());
        }
    }
}
