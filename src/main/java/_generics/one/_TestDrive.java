package _generics.one;


/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        AnimalList<Animal> animalList = new AnimalList<>();
        animalList.printText(new Cat("Meeow"));

        //
        AnimalList<Object> objects = new AnimalList<>();
        objects.printText(new Cat("Meeoww"));
        objects.printText(new Object());
    }
}
