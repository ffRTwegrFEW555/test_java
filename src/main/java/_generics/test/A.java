package _generics.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 08.01.2017, 18:06.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class A<T extends List<Number>> {
//public class A<T extends List<? extends Number>> {
//public class A<T extends ListTwo<?>> {
//public class A<T extends ListTwo<? extends Long>> {
//public class A<T extends ListTwo<? extends Number>> {

    public static void main(String[] args) {

        // ===============
        A<ArrayList<Number>> a;
//        A<ArrayList<Long>> b;

//        A<ListTwo<Number>> c;
//        A<ListTwo<Long>> d;
//        A<ListTwo<Thread>> e;

        // ===============
        ListOne<Thread> one1;
        ListOne<Number> one2;
        ListOne<Long> one3;


        // ===============
//        ListTwo<Thread> two;
        ListTwo<Number> two2;
        ListTwo<Long> two3;


        // ===============
        ListThree<Thread> three1;
        ListThree<Number> three2;
        ListThree<Long> three3;
    }
}
