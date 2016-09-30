package _enum.three;

/**
 * Created by USER on 26.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        for (Numbers number : Numbers.values()) {
            number.printText();
        }
    }
}
