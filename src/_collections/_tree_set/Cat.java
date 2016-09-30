package _collections._tree_set;

/**
 * Created by Vad on 18.06.2016.
 */
public class Cat implements Comparable {
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // may be used alt + insert -> generate equals and hashCode?
    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cat cat = (Cat) o;

        if (age != cat.age)
            return false;
        if (!name.equals(cat.name))
            return false;
        return color.equals(cat.color);
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Cat) o).getName());
    }
}
