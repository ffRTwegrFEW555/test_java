package _assert;

/**
 * Created by Vad on 19.06.2016.
 */
public class AssertDefault {
    public static void main(String[] args) {

        //
        // VM options: -ea
        // /* enable assert function */
        //


        //
        int a = (int) (Math.random() * 10);
        System.out.println(a);

        // Оператор контроля
        assert (a > 5);

        //
        System.out.println("");
        System.out.println("===========     Very end     ===========");
    }
}
