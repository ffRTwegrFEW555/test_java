package _this;

/**
 * Created by USER on 21.09.2016.
 */
public class Cat extends Feline {
    private Cat(String name, int defaultNumber) {
        super(defaultNumber);
        setName(name);
        System.out.println("3");
    }

    public Cat(String name) {
        this(name, 999);
        System.out.println("2");
    }
}
