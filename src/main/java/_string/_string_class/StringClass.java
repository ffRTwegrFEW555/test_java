package _string._string_class;

/**
 * Created by Vad on 03.05.2016.
 *
 * https://habrahabr.ru/post/260767/
 *
 */
public class StringClass {

    public static void main(String[] args) {
        String s = "22";
        System.out.println("test" + "22"    == "test22");
        System.out.println("test" + s       == "test22");
    }
}
