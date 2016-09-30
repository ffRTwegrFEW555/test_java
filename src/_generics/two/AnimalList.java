package _generics.two;

import java.util.ArrayList;

/**
 * Created by USER on 22.09.2016.
 */
public class AnimalList<E> extends ArrayList<E> {
    @Override
    public void add(int index, E element) {
        super.add(index, element);
        System.out.println(element + " added at position # " + index);
    }
}
