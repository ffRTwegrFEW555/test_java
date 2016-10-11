package _thread._priority;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by USER on 10.10.2016.
 */
public class _TestDrive {
    private final static Map<Thread, Integer> MAP_THREADS_COUNT = new HashMap<>();

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                _TestDrive.incrementThreads();
            }
        };

        Thread threadFirst = new Thread(r);
        Thread threadSecond = new Thread(r);
        Thread threadThird = new Thread(r);

        threadFirst.setPriority(Thread.MIN_PRIORITY);
        threadSecond.setPriority(Thread.NORM_PRIORITY);
        threadThird.setPriority(Thread.MAX_PRIORITY);

//        same
//
//        firstThread.setPriority(1);
//        firstThread.setPriority(5);
//        firstThread.setPriority(10);

        threadFirst.start();
        threadSecond.start();
        threadThird.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        threadFirst.interrupt();
        threadSecond.interrupt();
        threadThird.interrupt();

        try {
            threadThird.join();
            threadFirst.join();
            threadSecond.join();
        } catch (InterruptedException e) {
        }

        for (Map.Entry pair : MAP_THREADS_COUNT.entrySet()) {
            System.out.println(String.format("%-20s %2s %12s", pair.getKey(), ":", pair.getValue()));
        }

    }

    private static void incrementThreads() {
        Thread currentThread = Thread.currentThread();

        while (!currentThread.isInterrupted()) {
            synchronized (MAP_THREADS_COUNT) {
                if (MAP_THREADS_COUNT.containsKey(currentThread)) {
                    MAP_THREADS_COUNT.put(currentThread, MAP_THREADS_COUNT.get(currentThread) + 1);
                } else {
                    MAP_THREADS_COUNT.put(currentThread, 1);
                }
                MAP_THREADS_COUNT.notifyAll();
            }
        }
    }
}

