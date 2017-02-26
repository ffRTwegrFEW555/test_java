package _extends;

/**
 * Created by USER on 24.02.2017, 2:16.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        Parent name = new Sub();
        name.test();
        name.test2();

        Sub name2 = new Sub();
        name2.test();
        name2.test2();
    }
}
