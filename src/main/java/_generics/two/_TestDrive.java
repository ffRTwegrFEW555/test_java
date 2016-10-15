package _generics.two;

import java.util.ArrayList;

/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        AnimalList<Animal> animals = new AnimalList<>();
        animals.add(0, new Cat("Meeoww"));
        animals.add(0, new Cat("Meeoww"));
        animals.add(0, new Cat("Meeoww"));
        animals.add(0, new Cat("Meeoww"));
//        animals.add(0, new Object());

        System.out.println(animals.size());
    }
}
