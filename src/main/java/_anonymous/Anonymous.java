package _anonymous;

/**
 * Created by Vad on 05.07.2016.
 */
public class Anonymous {

    public static void main(String[] args) {

        //
        SuperMegaClass test = new SuperMegaClass() {
            int x = 10;
            public void goGo() {
                sout();
            }

            public void sout() {
                System.out.println("Anonymous construction");
                System.out.println("x: " + x);
            }
        };

        test.goGo();

        // А так нельзя,
        // потому что в анонимке он появился, а в оригинале класса нету
        // test.sout();

        //
        Thread thread = new Thread()
        {
            public void run()
            {
                printHi();
            }

            public void printHi()
            {
                System.out.println("Hi!");
            }
        };

        thread.run();
    }
}
