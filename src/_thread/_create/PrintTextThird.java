package _thread._create;

/**
 * Created by USER on 21.09.2016.
 */
public class PrintTextThird extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("== Third way");
        }
    }
}
