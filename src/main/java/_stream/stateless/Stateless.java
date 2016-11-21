package _stream.stateless;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

/**
 * Created on 18.11.2016, 19:27, 22:03.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Stateless {
    public static void main(String[] args) {

        //
        int count = 1;
        List<String> stringList = new ArrayList<>();

/*
        //
        count = 2;

        //
        stringList = new ArrayList<>();
*/

        //
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .parallel()
                .map((i) -> {
                    System.out.println(count);
                    stringList.add("First");
                    return 0;
                })
                .count();
/*
        //
        try {
            System.out.println(++count);
            Thread.sleep(1000);
            System.out.println(++count);
            Thread.sleep(1000);
            System.out.println(++count);
            Thread.sleep(1000);
            System.out.println(++count);
            Thread.sleep(1000);
            System.out.println(++count);
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        //
        stringList = new ArrayList<>();
*/
    }
}
