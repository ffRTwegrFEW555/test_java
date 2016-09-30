package _comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Jack", "White", "S"));
        cats.add(new Cat("Max", "Green", "S"));
        cats.add(new Cat("Jack", "Purple", "X"));
        cats.add(new Cat("Max", "Blue", "X"));
        cats.add(new Cat("Elizabet", "White", "X"));
        cats.add(new Cat("Jack", "White", "L"));
        cats.add(new Cat("Elizabet", "Grey", "X"));
        cats.add(new Cat("Max", "White", "X"));
        cats.add(new Cat("Jack", "White", "X"));
        cats.add(new Cat("Jack", "Black", "X"));

        //
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        //
        System.out.println();

        //
        Collections.sort(cats);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        //
        System.out.println();

        //
        Collections.sort(cats, new ComparableColorNameSize());
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
