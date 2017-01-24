package _number._integer;

/**
 * Created by USER on 23.01.2017, 17:46.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        Integer a = new Integer(120);
        Integer b = 120;
        int c = 120;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println();
        System.out.println("==========================");
        System.out.println();

        Integer x = new Integer(-128);
        Integer y = -128;
        System.out.println(x == y);

    }
}
