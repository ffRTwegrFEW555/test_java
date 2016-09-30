package _thread.uncaught_exception_handler.one;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Vad on 31.07.2016.
 */
public class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Producer(new ConcurrentHashMap<>()));
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
