package _functional_lambda.comparator;

import java.util.Comparator;
/**
 * Created by USER on 18.11.2016, 20:19.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Comparator<Car> carComparator = (c1, c2) -> c1.getWeight() - c2.getWeight();

        //
        Car car1 = new Car("Tesla", "White", 500, 250);
        Car car2 = new Car("Lada", "Black", 1000, 150);

        // Default, by maxSpeed
        System.out.println(
                car1.compareTo(car2)
        );

        //
        System.out.println(
                carComparator
                        .compare(car1, car2)
        );

        //
        System.out.println(
                carComparator
                        .reversed()
                        .compare(car1, car2)
        );

        // first, by weight, then by model;
        // need to test in List;
        System.out.println(
                carComparator
                        .thenComparing(
                                (c1, c2) -> c1.getModel().compareTo(c2.getModel()))
                        .compare(car1, car2)
        );
    }

}
