package _final;

/**
 * Created by USER on 21.09.2016.
 */
public class Animal {

    public static final String ANIMAL_TYPE = "default";
    public static final String COLOR;

//    public final int number;
    public final int age = 10_000_000;
    public final int speed;

    static {
        COLOR = "Grey";
    }

    public Animal() {
//        age = 10;
        speed = 10;
    }

    public final void eat() {
        System.out.println("Om-om");
    }

    public void walk() {
        System.out.println("Pam-param");
    }
}
