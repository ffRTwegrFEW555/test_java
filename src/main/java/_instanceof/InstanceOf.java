package _instanceof;

/**
 * Created by USER on 17.01.2017, 18:25.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class InstanceOf {
    public static void main(String[] args) {
        Cat c       = new Cat();
        Bird b      = new Bird();

        Animal a1   = new Cat();
        Animal a2   = new Bird();

        System.out.println(c instanceof Animal);
        System.out.println(c instanceof Flyable);

        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Flyable);

        System.out.println(a1 instanceof Animal);
        System.out.println(a1 instanceof Cat);
        System.out.println(a1 instanceof Flyable);

        System.out.println(a2 instanceof Animal);
        System.out.println(a2 instanceof Bird);
        System.out.println(a2 instanceof Flyable);

        System.out.println(c instanceof Cloneable);
    }
}
