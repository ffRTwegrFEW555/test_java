package _lambda_functional;

import _lambda_functional.entity.User;
import _lambda_functional.entity.UserFactory;

import java.util.Arrays;

/**
 * Created by USER on 12.11.2016, 21:06.
 */
public class _TestDrive {
    public static void main(String[] args) {

        // default
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("one");
            }
        });
        thread.start();

        // lambda
        Thread thread2 = new Thread(() -> System.out.println("two"));
        thread2.start();

        // link to static method
        Arrays.asList(1, 2, 3).forEach(System.out::println);

        // #1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };
        runnable.run();

        Thread thread4 = new Thread(runnable);
        thread4.start();

        // #2
        Runnable runnable2 = () -> System.out.println("runnable2");
        runnable2.run();

        Thread thread5 = new Thread(runnable2);
        thread5.start();

        // #3 /* nothing to print */
        Runnable runnable3 = System.out::println;
        runnable3.run();

        Thread thread6 = new Thread(runnable3);
        thread6.start();

        // ##1
        Converter<String, Integer> converter = data -> Integer.parseInt(data);
        int converted = converter.convert("123");
        System.out.println(converted);

        // ##2
        Converter<String, Integer> converter2 = Integer::parseInt;
        System.out.println(converter2.convert("1111"));

        // ::new
        UserFactory userFactory = User::new;
        User user = userFactory.create("Bob", 777);
        System.out.println(user);

        /*
            TODO:
            Predicate
            Function
            Supplier
            Consumer
            Optional

            Map.computeIf.... and etc
         */


    }
}
