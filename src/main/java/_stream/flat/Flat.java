package _stream.flat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created on 21.11.2016, 20:08.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class Flat {
    public static void main(String[] args) {

        //
        IntStream
                .range(1, 5)
                .mapToObj((i) -> new Car("car_" + i))
                .peek((c) -> IntStream
                        .range(1, 5)
                        .forEach((j) -> c
                                .getDetails()
                                .add(new Detail(
                                        "detail_" + j +
                                        " (" + c.getModel() + ")",
                                        "commect_" + j))))
                .flatMap(Car::getDetailsStream)
                .forEach(System.out::println);

        //
        System.out.println();

        //
        List<String> stringList = Stream.of("1, 2, 3", "4, 5, 6")
                .flatMap((s) -> Stream.of(s.split(", ")))
                .map((s) -> s.concat("_!"))
                .collect(Collectors.toList());

        System.out.println(stringList);
    }



}
