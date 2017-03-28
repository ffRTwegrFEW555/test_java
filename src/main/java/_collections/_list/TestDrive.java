package _collections._list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 19.03.2017, 13:23.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.add(null);

        integers.forEach(System.out::println);
    }
}
