package _primitives._int;

/**
 * Created by USER on 19.01.2017, 15:31.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        int i = false ? 0 : false ? 1 : false ? 2 : null;
        System.out.println(i);

        int j = true ? null : 0;
//        int j = null;
    }
}
