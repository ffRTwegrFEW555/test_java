package _proxy;

/**
 * Created by USER on 24.02.2017, 2:38.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Person implements Unit {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printText() {
        doIt();
    }

    private void doIt() {
        System.out.println("Text");
    }
}
