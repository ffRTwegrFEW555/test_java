package _interface;

/**
 * Created by USER on 16.11.2016, 17:22.
 */
public class Cat implements Animal {
    @Override
    public int getRandom() {
        return Animal.random * 2;
    }

    @Override
    public void printText() {
        System.out.println(
                "age: " + getAge() + "\n" +
                "number: " + getNumber());

        System.out.println(
                "random: " + getRandom());
    }


}
