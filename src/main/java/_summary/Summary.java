package _summary;

import _summary.test.Test;

import java.io.*;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Summary {
    private String s = "one";
    private int i = 56;
    private long l = 10;
    private float f = 12;

    public static void main(String[] args) {

        for (final int i : new int[] {1, 2, 3}) {
            System.out.println(i);
        }

        String a = "test";
        String b = "test";
        System.out.println(a == b);

        a = a + "1";
        b = b + "1";
        System.out.println(a == b);

        System.out.println(0.0 / 0.0);

        switch(1) {
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }

        try {
            Summary sum = new Summary();
            System.out.println(sum);
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new RuntimeException();

    }

    public static void test() {}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Summary summary = (Summary) o;

        if (i != summary.i) return false;
        if (l != summary.l) return false;
        if (Float.compare(summary.f, f) != 0) return false;
        return s != null ? s.equals(summary.s) : summary.s == null;
    }

    @Override
    public int hashCode() {
        int result = s != null ? s.hashCode() : 0;
        result = 31 * result + i;
        result = 31 * result + (int) (l ^ (l >>> 32));
        result = 31 * result + (f != +0.0f ? Float.floatToIntBits(f) : 0);
        return result;
    }
}


