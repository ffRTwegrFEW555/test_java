package _operators;

/**
 * Created by Vad on 01.05.2016.
 *
 * Проверка операторов.
 *
 */
public class Operators {
    public static void main(String[] args) {
        System.out.println("14 % 5: " + 14 % 5);
        System.out.println("");

        int a = 10;
        System.out.println("a: " + a);
        System.out.println("");

        a = a >> 2;
        System.out.println("a >> _super: " + a);
        System.out.println("");

        a = a << 2;
        System.out.println("a << _super: " + a);
        System.out.println("");

        int b = 10;
        int c = 20;
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("");

        int d = b | c;
        System.out.println("b | c: " + d);
        System.out.println("");

        System.out.println("d - в двоичном виде: " + Integer.toString(d, 2));
        System.out.println("d - в двоичном виде: " + Integer.toBinaryString(d));
        System.out.println("");

        System.out.println("Выводим числа в двоичном виде для тестирования: ");
        byte[] bytes = new byte[]{22, 4};
        for (int i = 0; i < bytes.length; i++) {
            String s = Integer.toBinaryString(bytes[i]);
            if (s.length() > 8)
                System.out.print(s.substring(s.length() - 8));
            else if (s.length() < 8) {
                while (s.length() != 8)
                    s = "0" + s;
                System.out.print(s);
            }
            else
                System.out.print(s);

            if (i == 3)
                System.out.println("");
            else
                System.out.print(" ");
        }
        System.out.println("");

        int x = 10;
        System.out.println("x: " + x);
        System.out.println("");

        x = x >>> 2;
        System.out.println("x >>> _super: " + x);
        System.out.println("");

        x = x << 2;
        System.out.println("x << _super: " + x);
        System.out.println("");


        ////////////////////

        System.out.println("// Операторы &&, ||, &, | :");
        System.out.println();
        int aaa = 10;
        System.out.println("aaa: " + aaa);
        int bbb = 10;
        System.out.println("bbb: " + bbb);
        int ccc = 11;
        System.out.println("ccc: " + ccc);
        int ddd = 11;
        System.out.println("ddd: " + ddd);
        System.out.println();
        System.out.print("aaa == bbb && ccc == ddd : ");
        System.out.println(aaa == bbb && ccc == ddd);
        System.out.print("aaa == ccc && bbb == ddd : ");
        System.out.println(aaa == ccc && bbb == ddd);
        System.out.print("!(aaa == ccc) && !(bbb == ddd) : ");
        System.out.println(!(aaa == ccc) && !(bbb == ddd));

        ////////////////////

        //
        System.out.println("");

        //
        int a_22 = 10;
        int b_22 = 4;
        System.out.println(a_22 | b_22);

    }
}
