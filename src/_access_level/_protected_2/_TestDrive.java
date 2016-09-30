package _access_level._protected_2;

import _access_level._protected.*;

/**
 * Created by USER on 25.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        Animal animal = new Animal();

        //
        System.out.println(animal.one);
//        System.out.println(animal.two);
//        System.out.println(animal.three);
//        System.out.println(animal.four);

        //
        animal.one();
//        animal.two();
//        animal.three();
//        animal.four();
    }
}
