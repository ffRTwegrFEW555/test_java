package _regex;

/**
 * Created by USER on 03.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        String symbols = "abcd 123";
        String digitsWithSpace = "123 ";
        String digits = "123";

        System.out.println(symbols.matches("[0-9]+"));
        System.out.println(digitsWithSpace.matches("[0-9]+"));
        System.out.println(digits.matches("[0-9]+"));
    }
}
