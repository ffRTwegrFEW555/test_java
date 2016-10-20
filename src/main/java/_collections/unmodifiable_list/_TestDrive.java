package _collections.unmodifiable_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Created by USER on 19.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();

        // do list is not modifiable
        List<Object> objectListNotModifiable = Collections.unmodifiableList(objectList);

        try {
            objectListNotModifiable.add(new Object());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
