package _constant;

/**
 * Created by USER on 27.01.2017, 14:01.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Tasks2 {

    // see bytecode
    public static Tasks2 instance = new Tasks2();
    private static final int DELTA = 5;
    private static final int BASE = 7;
    private int x;

    public Tasks2() {
        x = DELTA + BASE;
    }

    public static int getBASE() {
        return BASE;
    }

    public static void main(String[] args) {
        System.out.println(Tasks2.instance.x);
    }
}
