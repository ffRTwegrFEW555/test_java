package _math._numeration_system;

/**
 * Created by USER on 24.11.2016, 20:03.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        int a = 0x1F;
        System.out.println(a); // 31

        int b = 0b00001010;
        System.out.println(b); // 10

        int c = 015;
        System.out.println(c); // 13

        //
        System.out.println(
                Integer.parseInt("1F", 16) // 31
        );

        System.out.println(
                Integer.toString(241, 16) // F1
        );

        System.out.println(
                Integer.toHexString(241) // F1
                // Integer.toBinaryString()
                // Integer.toOctalString()
        );

        //
        System.out.println(
                Integer.highestOneBit(10) // 8
        );

        System.out.println(
                Integer.lowestOneBit(10) // 2 (i & -i)
        );


        // =====================

        long    l = 1L;
        float   f = 1.0F;
        double  d = 1.0D;


        // =====================

        double e = 47e47;
        System.out.println(e);
        System.out.println(Double.toHexString(e));

    }
}
