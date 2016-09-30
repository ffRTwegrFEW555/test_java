package _assert;

/**
 * Created by Vad on 19.06.2016.
 */
public class AssertWithInformation {
    public static void main(String[] args) {

        //
        // VM options: -ea
        // /* enable assert function */
        //


        //
        int a = (int) (Math.random() * 10);
        System.out.println(a);

        // Оператор контроля с дополнительной информацией
        assert (a > 5) : "\n\n>>>>>>     debug information: int a = " + a + "     <<<<<<\n\n";

        //
        System.out.println("");
        System.out.println("===========     Very end     ===========");
    }
}
