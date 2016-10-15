package _clone;

/**
 * Created by Vad on 09.07.2016.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Cat cat1 = new Cat("Kotik", 2, "Polosatiy", "XXL");
        System.out.println(cat1);

        //
        System.out.println();

        // Clone by Default
        Cat cat2 = null;
        try {
            cat2 = cat1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(cat2);

        //
        System.out.println();

        // Clone override
        Cat cat3 = null;
        cat3 = cat1.cloneNew();
        System.out.println(cat3);
    }
}
