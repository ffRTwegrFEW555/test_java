package _summary.test.test_to_company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 12.01.2017, 18:58.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        System.out.println(c.a);                // C.a
        System.out.println(c.s);                // C.s
        System.out.println(b.a);                // C.a // B.a
        System.out.println(b.s);                // B.s
        System.out.println(c.printA());         // a=B.a s=B.s
        System.out.println(c.getValues());      // a=C.a s=C.s
        System.out.println(b.getValues());      // a=C.a s=C.s
        System.out.println(c.printValue());     // s=B.s
        System.out.println(b.printValue());     // s=B.s
        System.out.println(c.getStaticValue()); // s=C.s
        System.out.println(b.getStaticValue()); // s=C.s // B.s
    }
}
