package _exception._exception_1;

/**
 * Created by Vad on 26.05.2016.
 */
public class RunOne {

    public void runBabyRun(int x, int y) {
        System.out.println(x / y);

        if (x == 4)
            return;
        else
            System.out.println("x != 4");

        System.out.println("// after \"if (x == 4)\"");

    }

    Exception exception = new ExceptionRunOne();

    public void throwExceptionRunOne() throws Exception {
        throw exception;
    }

    public void throwExceptionRunOneWithNew() throws Exception {
        throw new ExceptionRunOne();
    }
}
