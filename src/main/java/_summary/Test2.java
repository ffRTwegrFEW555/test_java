package _summary;

/**
 * Created by USER on 30.03.2017, 10:04.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Test2 extends Summary {

    public static void test() {}

    public void makeIt(Integer i) {}

    public void makeIt(String s) {}

    public static void main(String[] args) {
        p1:
        {
            p2:
            {
                System.out.println(1);
                if (true) break p2;
                System.out.println(2);
            }
            System.out.println(3);
        }

        int[] i = new int[] {1, 2, 3};
        for (int j : i) {
            System.out.println(j);
        }
    }


    String s;

}
