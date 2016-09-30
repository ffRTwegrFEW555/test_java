package _message_format;

/**
 * Created by Vad on 14.07.2016.
 */
public class Cat {
    private String name;
    private int age;
    private double speed;

    public Cat(String name, int age, double speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }
}
