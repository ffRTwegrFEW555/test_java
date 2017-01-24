package _summary.test.test;

/**
 * Created by USER on 18.01.2017, 18:25.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class B extends A {

    {
        System.out.println(2);
    }

    static {
        System.out.println(6);
    }

    public B() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        new B();
    }
}
