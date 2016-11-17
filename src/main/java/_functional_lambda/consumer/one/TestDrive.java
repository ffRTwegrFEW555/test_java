package _functional_lambda.consumer.one;

import java.util.function.Consumer;
/**
 * Created by USER on 17.11.2016, 21:41.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Cat murzik = new Cat("Murzik", 22, "Black");
        Cat polosatiy = new Cat("Polosatiy", 12, "White");

        //
        Consumer<Cat> catConsumer = (c) -> {
            System.out.println("NAME: " + c.getName().toUpperCase());
            System.out.println(c.getId() + "....");
        };

        //
        Consumer<Cat> catAgeConsumer = (c) -> {
            System.out.println("AGE: " + c.getAge());
        };

        //
        catConsumer.accept(murzik);
        System.out.println();

        //
        catConsumer
                .andThen(catAgeConsumer)
                .andThen(catConsumer)
                .accept(murzik);
    }
}
