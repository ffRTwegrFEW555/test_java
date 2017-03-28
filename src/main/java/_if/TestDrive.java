package _if;

/**
 * Created by USER on 22.03.2017, 14:22.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String ...args) {
        boolean a = true;
        boolean b = false;

        if (a == true) {
            if (b = true) { // < < < < < < < < < < < < <    --------------------------
                System.out.println("result");
            }
        }
    }
}
