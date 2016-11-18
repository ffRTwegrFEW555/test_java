package _functional_lambda.comparator;

/**
 * Created by USER on 18.11.2016, 20:21.
 */
public class Car implements Comparable {
    private String model;
    private String color;
    private int weight;
    private int maxSpeed;

    public Car(String model, String color, int weight, int maxSpeed) {
        this.model      = model;
        this.color      = color;
        this.weight     = weight;
        this.maxSpeed   = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return String.valueOf(hashCode());
    }

    @Override
    public int compareTo(Object o) {
        return this.maxSpeed - ((Car) o).getMaxSpeed();
    }
}
