package _system._properties;

/**
 * Created by USER on 17.12.2016, 10:34.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println();

        System.out.println(System.getProperty("user.name"));
        System.out.println();

        System.out.println(System.getenv());
        System.out.println();

        System.out.println(System.getProperty("java.library.path"));
        System.out.println();

    }
}
