package _access_level._one;

/**
 * Created by USER on 25.09.2016.
 */
public class Animal {
    private String name;
    private static Animal animal = new Animal();

    public void setName(String name) {
        this.name = name;
    }

    private void printText() {
        System.out.println(name);
    }

    private void testAnimalPrivate() {

        // Mother Fucker -- this is private methods and variables!
        animal.setName("TestName");
        animal.printText();
        animal.name = "NewName";
        animal.printText();
    }

    public void testAnimalPublic() {
        testAnimalPrivate();
    }
}
