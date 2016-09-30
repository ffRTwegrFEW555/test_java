package _thread.uncaught_exception_handler.two;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 1. каждые полсекунды выводить на консоль с новой строки начиная с 1 фразу [Some text for i] , пример "Some text for 1"
 * 2. при возникновении исключения выводить в консоль [[TREAD_NAME] thread was terminated], пример "[thread-1] thread was terminated"
 */
public class Producer
        implements Runnable {
    protected ConcurrentHashMap<String, String> map;
    private int count;
    
    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }
    
    @Override
    public void run() {

        // This method has a priority number 1
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("[" + t.getName() + "] Error 1");
                System.out.println(e);
            }
        });

        // Or
        // This method has a priority number 2
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("[" + t.getName() + "] Error 2");
//            }
//        });

        //
        try {
            while (true) {
                map.put("" + ++count, "Some text for " + count);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println();
            System.out.println("[" + Thread.currentThread().getName() + "] thread was terminated");

            System.out.println();
            Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);

            System.out.println();
            throw new RuntimeException("RuntimeExc");
        }
    }
}
