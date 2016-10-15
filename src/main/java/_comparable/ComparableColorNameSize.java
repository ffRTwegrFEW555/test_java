package _comparable;

import java.util.Comparator;

/**
 * Created by USER on 22.09.2016.
 */
public class ComparableColorNameSize implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getColor().compareTo(o2.getColor()) == 0 ?
                (o1.getName().compareTo(o2.getName()) == 0 ?
                        o1.getSize().compareTo(o2.getSize())
                        : o1.getName().compareTo(o2.getName())
                )
                : o1.getColor().compareTo(o2.getColor());
    }
}
