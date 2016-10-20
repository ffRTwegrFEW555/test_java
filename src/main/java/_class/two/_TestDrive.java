package _class.two;

/**
 * Created by USER on 17.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        System.out.println(new _TestDrive().getClass().getPackage());   // non-static;
        System.out.println(_TestDrive.class.getPackage());              // static;
        System.out.println(_TestDrive.class.getPackage().getName());              // static;
    }
}
