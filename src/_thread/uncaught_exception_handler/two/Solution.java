package _thread.uncaught_exception_handler.two;

import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        Producer producer = new Producer(map);
        Consumer consumer = new Consumer(map);

        //
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("[" + t.getName() + "] Error");
                    }
                });
                return thread;
            }
        };

        //
        ExecutorService executorService = Executors.newCachedThreadPool();
        // ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);

        // where is Exceptions ?! how get them? see bottom
//        executorService.submit(producer);
//        executorService.submit(consumer);

        executorService.execute(producer);
        executorService.execute(consumer);

        //
        Thread.sleep(2000);
        executorService.shutdownNow();

        // Where is "setUncaughtExceptionHandler"?
//        Future<?> future = executorService.submit(producer);
//        executorService.submit(consumer);
//        Thread.sleep(2000);
//        executorService.shutdownNow();
//
//        try {
//            future.get();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
