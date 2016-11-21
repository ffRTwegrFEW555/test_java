package _stream.parallel;

import java.util.List;
import java.util.ArrayList;

/**
 * Created on 21.11.2016, 17:01.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Parallel {
    public static void main(String[] args) {

        //
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        //
        integerList
                .parallelStream()
                .forEach(System.out::println);

        //
        System.out.println("\n============\n");

        //
        integerList
                .parallelStream()
                .forEachOrdered(System.out::println);
    }
}
