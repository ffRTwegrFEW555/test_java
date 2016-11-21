package _collections.collection_sort_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Vad on 15.06.2016.
 */
public class CollectionSort1 {
    public static void main(String[] args) {

        // Сортировка коллекций
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Funky");
        stringArrayList.add("ABBA");
        stringArrayList.add("Beautiful");
        stringArrayList.add("Car");
        stringArrayList.add("Dog");
        stringArrayList.add("Ann");
        stringArrayList.add("X-trail");
        stringArrayList.add("Ooops");

        //
        stringArrayList.forEach(System.out::println);
        System.out.println("\n===============================\n");

//        Collections.sort(stringArrayList);
        stringArrayList.sort(String::compareToIgnoreCase);

        stringArrayList.forEach(System.out::println);

        //
    }

}
