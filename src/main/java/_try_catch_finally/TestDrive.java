package _try_catch_finally;

/**
 * Created by USER on 02.02.2017, 12:33.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        System.out.println(getInt());
        System.out.println(getIntWithException());

        try {
            System.out.println(getIntThrowException());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int getInt() {
        try {
            return 1;
        } finally {
            return 0;
        }
    }

    public static int getIntWithException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            return 1;
        } finally {
            return 0;
        }
    }

    public static int getIntThrowException() {
        try {
            return 2;
        } catch (Exception e) {
            return 1;
        } finally {
            throw new RuntimeException();
            // return 0;
        }
    }
}
