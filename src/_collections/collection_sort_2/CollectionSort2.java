package _collections.collection_sort_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Vad on 18.06.2016.
 */
public class CollectionSort2 {
    public static void main(String[] args) {

        //
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Apollon", "color", 20));
        dogs.add(new Dog("Catrin", "apple", 12));
        dogs.add(new Dog("Dingo", "do", 24));
        dogs.add(new Dog("Bimbo", "yellow", 6));
        dogs.add(new Dog("Apollon", "orange", 20));
        dogs.add(new Dog("Dingo", "apple", 24));
        dogs.add(new Dog("Bimbo", "cyan", 6));
        dogs.add(new Dog("Apollon", "red", 20));
        dogs.add(new Dog("Bimbo", "black", 6));

        System.out.println("// default");
        System.out.println(dogs);
        System.out.println(dogs.get(2));
        System.out.println(dogs.get(2).getName());

        //
        System.out.println("");

        // Сортировка по умолчанию ( .compareTo() )
        Collections.sort(dogs);

        System.out.println("// by name");
        System.out.println(dogs);
        System.out.println(dogs.get(2));
        System.out.println(dogs.get(2).getName());

        //
        System.out.println("");

        // Сортировка с помощью компаратора ( .compare() )
        Collections.sort(dogs, new ColorCompare());

        System.out.println("// by color");
        System.out.println(dogs);
        System.out.println(dogs.get(2));
        System.out.println(dogs.get(2).getName());

        //
        System.out.println("");

        // Сортировка с помощью компаратора, версия _super (Сначала по имени, а потом по цвету)
        Comparator<Animal> animalComparator = Comparator.comparing(Animal::getName).thenComparing(Animal::getColor);
        Collections.sort(dogs, animalComparator);
        // или
        // Collections.sort(dogs, Comparator.comparing(Animal::getName).thenComparing(Animal::getColor));

        System.out.println("// by name, then color");
        System.out.println(dogs);
        System.out.println(dogs.get(2));
        System.out.println(dogs.get(2).getName());

//        //
//        // fail version
//        //
//        ArrayList<Robot> robots = new ArrayList<>();
//
//        robots.add(new Robot("Apollon", 20));
//        robots.add(new Robot("Catrin", 12));
//        robots.add(new Robot("Dingo", 24));
//        robots.add(new Robot("Bimbo", 6));
//
//        System.out.println(robots);
//        System.out.println(robots.get(_super));
//        System.out.println(robots.get(_super).getName());
//
//        // Here is Error (not implements Comparable)
//        // Collections.sort(robots);
//
//        System.out.println(robots);
//        System.out.println(robots.get(_super));
//        System.out.println(robots.get(_super).getName());

    }

}
