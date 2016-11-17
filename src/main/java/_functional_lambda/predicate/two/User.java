package _functional_lambda.predicate.two;

/**
 * Created by USER on 17.11.2016, 15:57.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private int gender; // 1 - female; 2 - male;

    public User(String name, int age, int gender) {
        this.name   = name;
        this.age    = age;
        this.gender = gender;
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

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  "\nid: " + this.id +
                ", name: " + this.name +
                ", age: " + this.age +
                ", gender: " + (this.gender == 1 ? "Ж" : this.gender == 2 ? "М" : "null");
    }
}
