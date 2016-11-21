package _stream.reduce;

/**
 * Created on 21.11.2016, 20:50.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Employe {
    private String name;
    private int age;

    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
