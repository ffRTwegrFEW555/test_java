package _stream.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 * Created by USER on 13.11.2016, 13:42, 14:07.
 */
public class Default {
    public static void main(String[] args) {

        //
        List<String> names = Arrays.asList("Bob", "Angela", "Carl");

        names
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        //
        Stream.of(names) // or Stream.of("Margarette", "John")
                .findFirst()
                .ifPresent(System.out::println);

        //
        System.out.println(
                IntStream.of(1, 2, 3).sum()
        );

        // LongStream
        // DoubleStream
        IntStream.range(1, 10)
                .forEach(System.out::println);

        //
        Arrays.stream(new int[]{222, 333, 444})
                .filter(i -> i == 222)
                .forEach(System.out::println);

        //
        Stream.of("a123", "b456", "c789")
                .map(s -> Integer.parseInt(s.substring(1)))
                .forEach(System.out::println);

        //
        Stream.of("a123", "b456", "c789")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

        //
        DoubleStream.of(1.22, 4.33, 3.11)
                .sorted()
                .mapToObj(d -> "String: " + d)
                .forEach(System.out::println);

        //
        // unsupported operation (unmodified collection)
        // List<String> names2 = Arrays.asList("Bob", "Angela", "Carl");
        List<String> names2 = new ArrayList<>(names);
        names2.removeIf((s) -> s.contains("a"));
        System.out.println(names2);
        System.out.println();

        //
        List<String> names3 = new ArrayList<>(names);
        names3.add("King");
        names3.retainAll(names); // delete all, but names;
        System.out.println(names3);
        System.out.println();

        //
        names3.retainAll(names2);
        System.out.println(names3);



    }
}
