package _summary.test;

/**
 * Created by USER on 04.01.2017, 22:37.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        Test test_1 = new Test("test_1");
        Test test_2 = new Test("test_2");
        test_1.printName(test_2);
    }
}
