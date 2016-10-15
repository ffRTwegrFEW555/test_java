package _access_level._one;

/**
 * Created by USER on 25.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        Animal ken = new Animal();
        ken.setName("Ken");
//        ken.printText();
//        ken.name = "NewName";
        ken.testAnimalPublic();

        //
        Feline feline = new Feline();
//        feline.testFelinePrivate();
//        feline.type = "new";
    }
}
