package _switch;

/**
 * Created by USER on 18.12.2016, 13:36.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        String str;
        if ((int) (Math.random() * 2) == 1) {
            str = "abc";
        } else {
            str = "eddw";
        }

        switch (str) {
            case "abc":
                int n = 1;
            case "eddw":
                n = 2;
            case "irt":
                n = 3;
            case "off":
                n = 4;
            case "uggg":
                n = 5;
                System.out.println("str: " + str + ", n: " + n);
                break;
            case "y":
            case "w":
                System.out.println("two");
                break;

            default:
                System.out.println("three");
                break;
        }


        //
        char c;
        if ((int) (Math.random() * 2) == 1) {
            c = 'a';
        } else {
            c = 'e';
        }

        switch (c) {
            case 'a':
                int n = 1;
            case 'e':
                n = 2;
            case 'i':
                n = 3;
            case 'o':
                n = 4;
            case 'u':
                n = 5;
                System.out.println("c: " + c + ", n: " + n);
                break;
            case 'y':
            case 'w':
                System.out.println("Условная гласная");
                break;

            default:
                System.out.println("Согласная");
                break;
        }


    }
}
