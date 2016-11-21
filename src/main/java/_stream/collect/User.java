package _stream.collect;

/**
 * Created by USER on 12.11.2016, 21:42.
 */
public class User {
    private static int idCount;
    private int id;
    private String name;
    private int age;

    public User(String name, int age) {
        id = ++idCount;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

