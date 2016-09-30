package _thread.uncaught_exception_handler.one;

import java.util.concurrent.ConcurrentHashMap;

public class Producer
        implements Runnable {
    protected ConcurrentHashMap<String, String> map;
    private int count;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {

        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("[" + t.getName() + "] Error");
            }
        });

        // Or
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("[" + t.getName() + "] Error");
//            }
//        });

        try {
            while (true) {
                System.out.println("Some text for " + ++count);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] thread was terminated");
            throw new RuntimeException();
        }
    }
}