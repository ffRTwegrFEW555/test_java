package _collections.collection_sort_2;

import java.util.Comparator;

/**
 * Created by Vad on 18.06.2016.
 */
public class ColorCompare implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getColor().compareTo(o2.getColor());
    }

}
