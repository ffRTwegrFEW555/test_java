package _class.class_loader;

/**
 * Created by USER on 11.01.2017, 14:59.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class ClassLoader extends Exception {
    public static void main(String[] args) {
        System.out.println(
                "A".getClass().getClassLoader()
        );

        System.out.println(
                ClassLoader.class.getSuperclass().getSimpleName()
        );
    }
}
