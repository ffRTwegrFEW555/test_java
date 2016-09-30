package _enum.two;

/**
 * Created by USER on 26.09.2016.
 */
public class _TestDrive {
    enum Numbers {
        ONE,
        TWO,
        THREE;
    }

    public static void main(String[] args) {
        Numbers numbers = Numbers.TWO;
        System.out.println(numbers.ordinal());
    }
}
