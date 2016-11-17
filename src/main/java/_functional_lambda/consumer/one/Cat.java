package _functional_lambda.consumer.one;

/**
 * Created by USER on 17.11.2016, 21:43.
 */
public class Cat {
    private static long id;
    private String  name;
    private int     age;
    private String  color;

    public Cat(String name, int age, String color) {
        ++this.id;
        this.name   = name;
        this.age    = age;
        this.color  = color;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
