package _collections.collection_sort_2;

/**
 * Created by Vad on 18.06.2016.
 */
public abstract class Animal implements Comparable<Animal> {
    String name;
    String color;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // int compareTo return { -1, 0, 1};
    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "\n" +
                "name: " + name + "; " +
                "color: " + color + "; " +
                "age: " + age + ";";
    }
}
