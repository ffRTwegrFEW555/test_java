package _regex;

/**
 * Created by USER on 03.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        //
        String symbols = "abcd 123";
        String digitsWithSpace = "123 ";
        String digits = "123";

        System.out.println(symbols.matches("[0-9]+"));
        System.out.println(digitsWithSpace.matches("[0-9]+"));
        System.out.println(digits.matches("[0-9]+"));

        // How to with regex?
        char[] charArray = " по улице шел , дождь, вот  так  ".toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isSpaceChar(charArray[i])) {
                if (i != charArray.length - 1) {
                    charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
                }
            }
        }

        System.out.println(charArray);
    }
}
