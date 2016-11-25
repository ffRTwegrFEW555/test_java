package _callable._void;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 *          Created by USER on 23.11.2016, 15:27.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        ExecutorService service = Executors.newFixedThreadPool(2);

        //
        Future<Void> voidFuture = service.submit(new EmptyJob());
        try {
            System.out.println(voidFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        //
        Future<String> stringFuture = service.submit(new Job());
        try {
            System.out.println(stringFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
