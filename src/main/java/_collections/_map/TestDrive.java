package _collections._map;

import java.util.HashMap;
import java.util.Map;

public class TestDrive {
    public static void main(String[] args) {
        byte[] one      = new byte[]{1, 2, 3};
        byte[] two      = new byte[]{1, 2, 3};
        byte[] three    = new byte[]{1, 2, 3};
        byte[] four     = new byte[]{1, 2, 3};

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println();

        Map<byte[], byte[]> map = new HashMap<>();

        //
        map.put(one, three);
        System.out.println(map.get(one));
        System.out.println();

        //
        map.put(one, four);
        System.out.println(map.get(one));
        System.out.println();

        //
        map.put(two, three);
        System.out.println(map.get(two));
        System.out.println(map.get(one));
        System.out.println();

        //
        map.put(one, two);
        System.out.println(map.get(two));
        System.out.println();
    }
}

/*
        [B@677327b6
        [B@14ae5a5
        [B@7f31245a
        [B@6d6f6e28

        [B@7f31245a

        [B@6d6f6e28

        [B@7f31245a
        [B@6d6f6e28

        [B@7f31245a
 */
