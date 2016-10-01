package _access_level._one;

/**
 * Created by USER on 01.10.2016.
 */
public class Feline extends Animal {
    private String type;
    private static Feline feline = new Feline();

    private void test() {}

    private void testFelinePrivate() {

        // Mother Fucker -- this is private methods and variables!
        feline.setName("TestName");

//        feline.printText();
//        feline.name = "NewName";

//        printText();
//        name = "NewName";

        feline.type = "newType";
        feline.test();
    }
}
