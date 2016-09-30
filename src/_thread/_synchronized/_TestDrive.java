package _thread._synchronized;

/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) throws InterruptedException {

        // non-Synchronized
        Runnable printText = new PrintText(1);
        Runnable printTextTwo = new PrintText(1);

        Thread thread = new Thread(printText);
        thread.setName("first");

        Thread threadTwo = new Thread(printTextTwo);
        threadTwo.setName("second");

        //
        thread.start();
        threadTwo.start();

        //
        Thread.sleep(3000);
        System.out.println();

        // Synchronized
        Runnable printTextSynchronized = new PrintText(2);
        Runnable printTextSynchronizedTwo = new PrintText(2);

        Thread threadSynchronized = new Thread(printTextSynchronized);
        threadSynchronized.setName("first");

        Thread threadSynchronizedTwo = new Thread(printTextSynchronizedTwo);
        threadSynchronizedTwo.setName("second");

        //
        threadSynchronized.start();
        threadSynchronizedTwo.start();
    }
}
