package _summary.test;

/**
 * Created by USER on 04.01.2017, 22:37.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Test {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    public void printName(Test test) {
        System.out.println(test.name);
    }
}
