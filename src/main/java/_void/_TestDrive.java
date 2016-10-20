package _void;

import java.util.concurrent.Callable;

/**
 * Created by USER on 18.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        // with return;
        Callable<Integer> integerCallable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 777;
            }
        };

        // when no return;
        Callable<Void> voidCallable = new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                return null;
            }
        };


    }
}
