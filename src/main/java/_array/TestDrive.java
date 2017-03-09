package _array;

/**
 * Created by USER on 01.03.2017, 17:06.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        // it is right code?
        Object[] strings = new String[5];
        strings[0] = new Object();
        strings[1] = new String("Test");
        strings[2] = new Integer(1);


        // it is right code?
        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = new String("Test");
        objects[2] = new Integer(1);


        // it is right code?
        int[][] i1 = {{1,2,3}, {0,0,0}};
        int[][] i2 = {{1,2,3}, {0,0,0,}};
        System.out.println(i2.length);
        System.out.println(i2[0].length);
        System.out.println(i2[1].length);
    }
}
