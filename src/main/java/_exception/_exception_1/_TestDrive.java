package _exception._exception_1;

/**
 * Created by Vad on 26.05.2016.
 */
public class _TestDrive {

    public static void main(String[] args) {
        //
        //
        RunOne runOne = new RunOne();

        //
        try {
            runOne.runBabyRun(5, 1);
            System.out.println("// try: end");
        } catch (Exception e) {
            System.out.println("// catch (Exception e): start");
            e.getMessage();
            e.printStackTrace();
        } finally {
            System.out.println("// finally: end");
        }

        //
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("");
        }

        //
        try {
            runOne.runBabyRun(5, 0);
            System.out.println("// try: end");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // e.printStackTrace(); /* тормознуто работает метод, поэтому в жопу его */
            System.out.println("// catch (Exception e): end");
        } finally {
            System.out.println("// finally: end");
        }

        //
        // блок "finally" обрабатывается в любом случае,
        // либо после блока "try", либо после блока "catch".
        //

        //
        //
        System.out.println("");

        //
        try {
            runOne.throwExceptionRunOne();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("// finally: end");
        }

        //
        // Если мы ловим разные исключения,
        // то дочерние классы исключений должны быть выше родительских
        //
        // Порядок играет важную роль.
        // Если исключения равны по иерархии, то можно расположить в любом порядке.
        //
        // Что выше - обрабатывается в первую очередь.
        //

        //
        try {
            runOne.throwExceptionRunOneWithNew();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //
        //
        System.out.println("");

        //
        runOne.runBabyRun(4, 2); /* сработал "return" */

    }

}
