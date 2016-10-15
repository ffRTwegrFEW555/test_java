package _super;

/**
 * Created by USER on 21.09.2016.
 */
public class Animal {
    private String name;
    private int defaultNumber;

    public Animal() {
        System.out.println("7");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("4");
    }

    public void setDefaultNumber(int defaultNumber) {
        this.defaultNumber = defaultNumber;
        System.out.println("6");
    }

    public String getName() {
        return name;
    }

    public int getDefaultNumber() {
        return defaultNumber;
    }
}
