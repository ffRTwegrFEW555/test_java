package _enum.one;

/**
 * Created by Vad on 16.07.2016.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Enumeration enumeration = Enumeration.DOWN;
        Enumeration enumeration1 = Enumeration.LEFT;
        Enumeration enumeration2 = Enumeration.DOWN;

        //
        System.out.println(enumeration.compareTo(enumeration1));
        System.out.println(enumeration.equals(enumeration1));
        System.out.println(enumeration.equals(enumeration2));
        System.out.println();

        // TODO: help me

        //
        System.out.println(enumeration.getDeclaringClass());
        System.out.println(enumeration.name());
        System.out.println(enumeration.ordinal());
        System.out.println(enumeration1.ordinal());
        System.out.println(enumeration2.ordinal());
        System.out.println(Enumeration.RIGHT.ordinal());
        System.out.println(enumeration);
        System.out.println(enumeration.toString());
        System.out.println();

        //
        Enumeration[] arrays = Enumeration.values();
        for (Enumeration en : arrays)
            System.out.println(en.ordinal() + ": " + en);
        System.out.println();

        //
        System.out.println(arrays[0]);
        System.out.println();

        //
        Enumeration newEnum = Enumeration.valueOf("RIGHT");
        System.out.println(newEnum.ordinal() + ": " + newEnum);
    }
}
