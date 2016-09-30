package _generics.one;


/**
 * Created by USER on 22.09.2016.
 */
public class AnimalList<E> {
    public void printText(E element) {
        if (element instanceof Animal) {
            System.out.println("Animal: " + element);
        }
        else {
            System.out.println(element);
        }
    }
}
