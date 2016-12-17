package _functional_lambda.function.one;

import java.util.function.Function;
/**
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 *
 * Created by USER on 17.11.2016, 17:00, 21:54.
 */
public class TestDrive {
    public static void main(String[] args) {

        // ===============
        Function<String, Integer> stringToInteger = Integer::parseInt;

        System.out.println(
                stringToInteger.apply("123")
        );
        System.out.printf("");

        // ===============
        Function<String, Integer> first         = (s) -> Integer.parseInt(s) + 1;
        Function<String, Integer> firstTwo      = (s) -> Integer.parseInt(s) + 2;
        Function<Integer, String> second        = (i) -> String.valueOf(i * i);
        Function<Integer, String> secondTwo     = (i) -> String.valueOf(i * 3);

        // >>>>> Forward
        System.out.println(
                first.andThen(second).apply("5") // 36
        );

        // <<<<< Back
        System.out.println(
                first.compose(second).apply(5) // 26
        );

        //
        System.out.println(
                first.andThen(second).andThen(firstTwo).apply("5") // 38
        );
        System.out.println(
                first
                        .andThen(second)
                        .compose(secondTwo)
                        .compose(firstTwo).apply("5") // 484
        );
        System.out.println(
                first
                        .andThen(second)
                        .compose(secondTwo)
                        .andThen(first)
                        .compose(firstTwo)
                        .apply("5") // 484 + 1
        );
        System.out.println(
                first.compose(second).andThen(secondTwo).apply(5) // 78
        );
        System.out.println(
                first
                        .compose(second)
                        .compose(first)
                        .andThen(secondTwo)
                        .compose(secondTwo)
                        .apply(5) // 771
        );

    }
}
