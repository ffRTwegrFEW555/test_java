package _primitives.type_conversion;

/**
 * Created by USER on 19.03.2017, 13:26.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String... args) {

        byte    b = 1;
        short   s = 3;
        char    c = 'a';
        int     i = 2;
        long    l = 4;

        // b = b + i;
        b = (byte) (b + i);
        b += i;

        // s = s + i;
        s = (short) (s + i);
        s += i;

        // c = c + i;
        c = (char) (c + i);
        c += i;

        l = l + i;
        l += i;


        ///////////////////////////////////////

        float   f0 = 1;
        // float   f0 = 1.0;
        double  d0 = 1;

        float   f = 1.0f;
        double  d = 1.0;

        // f = f + d;
        f = (float) (f + d);
        f += d;

        d = f + d;
        d += f;

    }
}
