package _class;

/**
 * Created by Vad on 25.06.2016.
 */
public class Cat extends Animal {

    //
    int a = 10;
    static int b = 15;
    final static int C = 20;

    public int a2 = 1010;
    public static int b2 = 1515;
    public final static int C2 = 2020;

    private int a3 = 101010;
    private static int b3 = 151515;
    private final static int C3 = 202020;

    void voidMethod() {}
    static void staticVoidMethod() {}

    int intMethod() { return 0;}
    static int intVoidMethod() { return 0;}

    //
    public Cat(int a) {
        this.a = a;
    }

    public Cat(int a2, int a3) {
        this.a2 = a2;
        this.a3 = a3;
    }
}
