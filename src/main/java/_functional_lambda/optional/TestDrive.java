package _functional_lambda.optional;

import java.util.Optional;

/**
 * Created on 18.11.2016, 21:59.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        String test     = "Test";
        String testNull = null;

        //
        Optional<String> stringOptional     = Optional.of(test);
        Optional<String> stringNullOptional = Optional.ofNullable(testNull);
        Optional<String> emptyOptional      = Optional.empty();

        //
        System.out.println(
                stringOptional.isPresent()
        );
        System.out.println();

        //
        stringOptional      .ifPresent(System.out::println);
        stringNullOptional  .ifPresent(System.out::println); // do not print;
        emptyOptional       .ifPresent(System.out::println); // do not print;
        System.out.println();

        //
        System.out.println(
                stringOptional.get()
        );
//        System.out.println(
//                stringNullOptional.get()
//        );
//        System.out.println(
//                emptyOptional.get()
//        );
        System.out.println();

        //
        System.out.println(
                stringNullOptional.orElse("-1")
        );
        System.out.println(
                emptyOptional.orElse("-1")
        );

    }

}
