package _label_break_continue;

/**
 * Created by Vad on 29.05.2016.
 */
public class _TestDrive {
    final static int startI;
    static int stop = 10;

    static {
        startI = (int) (Math.random() * 3);
    }

    public int return10() {
        return 10;
    }

    //
    //

    public static void main(String[] args) {

        boolean isCancel = false;

        for (int x = startI; x < new _TestDrive().return10(); x++) {
            System.out.println("x: " + x);

            for (int y = 0; !isCancel; y++) {
                System.out.println("y: " + y);

                if (y == 9) {
                    isCancel = true;
                }
            }
        }

        //
        System.out.println("Very End");
        System.out.println("");

        nachalo:

        for (int x = startI; x < _TestDrive.stop; x++) {
            System.out.println("x: " + x);

            for (int y = 0; y < 7; y++) {
                System.out.println("y: " + y);

                if (y == 4 && x == 4)
                    break nachalo;
            }
        }

        //
        System.out.println("Very End");
        System.out.println("");

        nachalo:

        for (int x = startI; x < _TestDrive.stop; x++) {
            System.out.println("x: " + x);

            for (int y = 0; y < 7; y++) {
                System.out.println("y: " + y);

                if (y == 4 && x == 4)
                    continue nachalo;
            }
        }

        //
        System.out.println("Very End");
        System.out.println("");

        for (int x = startI; x < _TestDrive.stop; x++) {
            System.out.println("x: " + x);

            nachalo:

            for (int y = 0; y < 7; y++) {
                System.out.println("y: " + y);

                if (y == 4 && x == 4)
                    break nachalo;
            }
        }

        //
        System.out.println("Very End");
        System.out.println("");

        for (int x = startI; x < _TestDrive.stop; x++) {
            System.out.println("x: " + x);

            nachalo:

            for (int y = 0; y < 7; y++) {
                System.out.println("y: " + y);

                if (y == 4 && x == 4)
                    continue nachalo;
            }
        }

        //
        System.out.println("Very End");
        System.out.println("");
    }
}
