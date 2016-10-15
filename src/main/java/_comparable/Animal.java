package _comparable;


/**
 * Created by USER on 22.09.2016.
 */
public class Animal implements Comparable<Animal> {
    private String name;
    private String color;
    private String size;

    public Animal(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public int compareTo(Animal a) {
        return name.compareTo(a.getName()) == 0 ?
                (color.compareTo(a.getColor()) == 0 ?
                        size.compareTo(a.getSize())
                        : color.compareTo(a.getColor())
                )
                : name.compareTo(a.getName());
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-5s", name, color, size);
    }

    //

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
