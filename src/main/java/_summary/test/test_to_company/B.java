package _summary.test.test_to_company;

/**
 * Created by USER on 12.01.2017, 18:59.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class B {
    String a = "B.a";
    static String s = "B.s";

    String printA() {
        return "a=" + a + " s=" + s;
    }

    String getValues() {
        return "a=" + a + " s=" + s;
    }

    String printValue() {
        return getStaticValue();
    }

    static String getStaticValue() {
        return "s=" + s;
    }
}
