package _extends;

/**
 * Created by USER on 24.02.2017, 2:14.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Sub extends Parent {

    public void test() {
        System.out.println("Sub test");
    }

    @Override
    public void test2() {
        System.out.println("Sub test2");
    }
}
