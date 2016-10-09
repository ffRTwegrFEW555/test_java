package _math;

/**
 * Created by USER on 05.10.2016.
 */
public class Random {
    public static void main(String[] args) {

        //
        for (int i = 0; i < 10; i++) {
            double temp = Math.random() * 2;
            System.out.println(temp);
            System.out.println(temp % 2);
            System.out.println();

        }

        //
        System.out.println();

        //
        int randomCountOfDishes = (int) (Math.random() * 5);
        for (int i = 0; i < (int) (Math.random() * 5); i++) {
            System.out.println("rr");
        }
    }
}
