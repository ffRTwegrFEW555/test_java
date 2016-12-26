package _hashcode;

/**
 * Created by USER on 05.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());

        //
        Long l = new Long(123455);
        System.out.println(hash(l));
        System.out.println();

        //
        int n = 10;
        int x = (n = 20) - n;
        System.out.println(x);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
