package _functional_lambda.map;

import java.util.Map;
import java.util.HashMap;

/**
 * Created on 21.11.2016, 17:10.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Map<Integer, String> integerStringMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            integerStringMap.put(i, "value_" + i);
        }

        //
        integerStringMap.forEach((k, v) -> System.out.println(k + ", " + v));
        System.out.println();

        // do not execute
        integerStringMap.computeIfPresent(101, (k, v) -> v.concat(k.toString()));

        // do not execute
        integerStringMap.computeIfAbsent(1, k -> "value_" + k);

        // do not execute
        int i = 1;
        integerStringMap.putIfAbsent(i, "value_" + i);

        //
        // integerStringMap.clear();

        //
        System.out.println(
                integerStringMap.getOrDefault(102, "Key is not exist.")
        );
        System.out.println();

        //
        integerStringMap.merge(5, "_5", String::concat);

        //
        integerStringMap.replaceAll((k, v) -> "_".concat(v));

        //
        integerStringMap.forEach((k, v) -> System.out.println(k + ": " + v));


    }
}
