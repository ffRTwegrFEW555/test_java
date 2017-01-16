package _summary.test.test_to_company;

/**
 * Created by USER on 12.01.2017, 18:59.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class C extends B{
    String a = "C.a";
    static String s = "C.s";

    String getValues() {
        return "a=" + a + " s=" + s;
    }

    static String getStaticValue() {
        return "s=" + s;
    }
}
