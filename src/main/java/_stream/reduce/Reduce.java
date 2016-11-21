package _stream.reduce;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;

/**
 * Created on 21.11.2016, 20:45.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Reduce {
    public static void main(String[] args) {

        //
//        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        IntStream.range(1, 11)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        //
        int result = IntStream
                .range(1, 10 + 1)
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(result);

        //
        List<Employe> employeList = Arrays.asList(
                new Employe("Jack", 30),
                new Employe("Monica", 35),
                new Employe("Morgan", 26),
                new Employe("Lucy", 32),
                new Employe("Kate", 31),
                new Employe("Jack", 33));

        employeList
                .stream()
                .reduce((e1, e2) -> e1.getAge() > e2.getAge() ? e1 : e2)
                .ifPresent(e -> System.out.println("Employe with max Age: " + e));

    }
}
