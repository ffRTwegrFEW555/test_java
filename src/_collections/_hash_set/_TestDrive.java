package _collections._hash_set;

import java.util.HashSet;

/**
 * Created by Vad on 18.06.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        Cat cat1 = new Cat("Donovan", "White", 22);
        Cat cat2 = new Cat("Erik", "Black", 2);
        Cat cat3 = cat1;
        Cat cat4 = new Cat("Erik", "Black", 2);
        Cat cat5 = new Cat("Erik", "Black", 3);
        Cat cat6 = new Cat("Alon", "Black", 55);

        //
        HashSet<Cat> cats = new HashSet<>();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        boolean result = cats.add(cat4);
        System.out.println(result);
        cats.add(cat5);
        cats.add(cat6);

        for (Cat cat : cats) {
            System.out.println("name: " + cat.getName() +
                    "       color: " + cat.getColor() +
                    "       age: " + cat.getAge());
        }
    }
}
