package _stream.two;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by USER on 13.11.2016, 20:16.
 */
public class StreamSupplier {
    public static void main(String[] args) {
        List<String> streamList = Arrays.asList("a1a", "b2b", "c3c");

        /* =========== */
        Stream<String> stringStream = streamList
                .stream()
                .map(s -> s.substring(1));

        stringStream
                .forEach(System.out::println);

/*
        // a stream has already been operated or closed
        stringStream
                .forEach(System.out::println);
*/


        /* =========== */
        Supplier<Stream<String>> streamSupplier = () -> streamList
                .stream()
                .map(s -> s.substring(1));

        streamSupplier
                .get()
                .forEach(s -> System.out.println("Supplier: " + s.substring(1) + " (" + s.hashCode() + ")"));

        // its work again
        streamSupplier
                .get()
                .forEach(System.out::println);

        // every time get a new Stream
        System.out.println(streamSupplier.get());
        System.out.println(streamSupplier.get());

        //
    }
}
