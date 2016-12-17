package _functional_lambda.predicate.one;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Arrays;


/**
 * Created on 16.11.2016, 17:46, 22:03.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class One {
    public static void main(String[] args) {

        //
        Predicate<String> stringPredicate = (s) -> s.length() > 5;
        Predicate<String> stringPredicateTwo = (s) -> s.length() < 7;
        Predicate<String> stringPredicateNotNull = Objects::nonNull;

        Predicate<String> stringPredicateNegate = stringPredicate.negate();

        //
        System.out.println(
                stringPredicate.test("123456"));
        System.out.println(
                stringPredicate.test("1234"));
        System.out.println();

        //
        System.out.println(
                stringPredicate.negate().test("123456"));
        System.out.println(
                stringPredicate.negate().test("1234"));
        System.out.println();

        //
        System.out.println(
                stringPredicate.and(stringPredicateTwo).test("123456")
        );
        System.out.println(
                stringPredicate.and(stringPredicateTwo).test("12345")
        );
        System.out.println(
                stringPredicate.or(stringPredicateTwo).test("12345678")
        );
        System.out.println();

        //
        Stream.of("12345", null, "12345678")
                .filter(stringPredicateNotNull.and(stringPredicate))
                .forEach(System.out::println);
        System.out.println();

        //
        System.out.println(
                stringPredicate.test("123")
        );
        System.out.println(
                stringPredicateNegate.test("123")
        );
        System.out.println();

        //
        System.out.println(stringPredicate);
        System.out.println(stringPredicateTwo);
        System.out.println(stringPredicateNotNull);
        System.out.println();

    }
}
