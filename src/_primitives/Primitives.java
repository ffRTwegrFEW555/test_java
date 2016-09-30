package _primitives;

/**
 * Created by Vad on 03.05.2016.
 *
 * https://habrahabr.ru/post/261315/ -- очень доходчиво объяснено
 *
 */
public class Primitives {
    public static void main(String[] args) {
        System.out.println("// Классы-обёртки для примитивов. Выводим максимальные и минимальные значения, установленные по-умолчанию.");

        System.out.println();
        System.out.println("Boolean: ");
        Boolean aBoolean = true;
        // System.out.println("MIN_VALUE: " + aBoolean.MIN_VALUE);
        // System.out.println("MAX_VALUE: " + aBoolean.MAX_VALUE);
        System.out.println("MIN_VALUE: " + "не поддерживает");
        System.out.println("MAX_VALUE: " + "не поддерживает");

        System.out.println();
        System.out.println("Character: ");
        Character character = 0;
        System.out.println("MIN_VALUE: " + character.MIN_VALUE);
        System.out.println("MAX_VALUE: " + character.MAX_VALUE);

        System.out.println();
        System.out.println("Byte: ");
        Byte aByte = 0;
        System.out.println("MIN_VALUE: " + aByte.MIN_VALUE);
        System.out.println("MAX_VALUE: " + aByte.MAX_VALUE);

        System.out.println();
        System.out.println("Short: ");
        Short aShort = 0;
        System.out.println("MIN_VALUE: " + aShort.MIN_VALUE);
        System.out.println("MAX_VALUE: " + aShort.MAX_VALUE);

        System.out.println();
        System.out.println("Integer: ");
        Integer integer = 0;
        System.out.println("MIN_VALUE: " + integer.MIN_VALUE);
        System.out.println("MAX_VALUE: " + integer.MAX_VALUE);

        System.out.println();
        System.out.println("Long: ");
        Long aLong = 0L;
        System.out.println("MIN_VALUE: " + aLong.MIN_VALUE);
        System.out.println("MAX_VALUE: " + aLong.MAX_VALUE);

        System.out.println();
        System.out.println("Float: ");
        Float aFloat = 0.0F;
        System.out.println("MIN_VALUE: " + aFloat.MIN_VALUE);
        System.out.println("MAX_VALUE: " + aFloat.MAX_VALUE);

        System.out.println();
        System.out.println("Double: ");
        Double aDouble = 0.0;
        System.out.println("MIN_VALUE: " + aDouble.MIN_VALUE);
        System.out.println("MAX_VALUE: " + aDouble.MAX_VALUE);
    }
}
