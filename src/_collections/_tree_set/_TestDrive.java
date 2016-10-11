package _collections._tree_set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Vad on 18.06.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        Cat cat1 = new Cat("Don", "White", 22);
        Cat cat2 = new Cat("Erik", "Black", 2);
        Cat cat3 = cat1;
        Cat cat4 = new Cat("Erik", "Black", 2);
        Cat cat5 = new Cat("Erik", "Black", 3);
        Cat cat6 = new Cat("Erik", "Cyan", 3);
        Cat cat7 = new Cat("Erik", "Apple", 3);
        Cat cat8 = new Cat("Erik", "Dermot", 3);
        Cat cat9 = new Cat("Jonathan", "Black", 3);
        Cat cat10 = new Cat("Antony", "Black", 3);
        Cat cat11 = new Cat("Carl", "Black", 3);
        Cat cat12 = new Cat("Bruce", "Black", 3);
        Cat cat13 = new Cat("Alon", "Black", 55);

        // sort by default -- TreeSet<> without args does not used equals() and hashCode(), but uses compareTo()
        TreeSet<Cat> cats = new TreeSet<>();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);
        cats.add(cat11);
        cats.add(cat12);
        cats.add(cat13);

        for (Cat cat : cats) {
            System.out.println("name: " + cat.getName()
                    + "       color: " + cat.getColor()
                    + "       age: " + cat.getAge());
        }

        //
        System.out.println("");

        // sort by comparator -- TreeSet<> with comparator does not used compareTo(), but uses Comparator, equals() and hashCode()
        TreeSet<Cat> cats2 = new TreeSet<>(Comparator.comparing(Cat::getAge)
                                                   .thenComparing(Cat::getName)
                                                   .thenComparing(Cat::getColor));

        cats2.add(cat1);
        cats2.add(cat2);
        cats2.add(cat3);
        cats2.add(cat4);
        cats2.add(cat5);
        cats2.add(cat6);
        cats2.add(cat7);
        cats2.add(cat8);
        cats2.add(cat9);
        cats2.add(cat10);
        cats2.add(cat11);
        cats2.add(cat12);
        cats2.add(cat13);

        for (Cat cat : cats2) {
            System.out.println("name: " + cat.getName()
                    + "       color: " + cat.getColor()
                    + "       age: " + cat.getAge());
        }
    }
}
