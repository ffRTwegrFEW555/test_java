package _generics.three;

import java.util.ArrayList;

/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Meeoww"));
        animals.add(new Dog("Hawhaw"));

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Terminator"));
        cats.add(new Cat("Terminatorr"));

        //
        Method.methodOne(animals);
        Method.methodOne(cats);

        Method.methodThree(animals);
        Method.methodThree(cats);

        Method.methodFour(animals);
//        Method.methodFour(cats);
    }
}
