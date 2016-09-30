package _generics.three;

import java.util.ArrayList;

/**
 * Created by USER on 22.09.2016.
 */
public class Method {
    public static <T extends Animal> void methodOne(ArrayList<T> arrayList) {
        arrayList.remove(0);
//        arrayList.add(new Cat("Meeoww"));
//        arrayList.add(new Animal("Amamam"));
        T object = null;
    }

//    public static void methodTwo(ArrayList<T> arrayList) {
//        arrayList.remove(0);
////        arrayList.add(new Cat("Meeoww"));
////        arrayList.add(new Animal("Amamam"));
//        T object = null;
//    }

        public static void methodThree(ArrayList<? extends Animal> arrayList) {
        arrayList.remove(0);
//        arrayList.add(new Cat("Meeoww"));
//        arrayList.add(new Animal("Amamam"));
//        T object = null;
    }

    public static void methodFour(ArrayList<Animal> arrayList) {
        arrayList.remove(0);
        arrayList.add(new Cat("Meeoww"));
        arrayList.add(new Animal("Amamam"));
    }
}
