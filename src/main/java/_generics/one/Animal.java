package _generics.one;

/**
 * Created by USER on 22.09.2016.
 */
public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
