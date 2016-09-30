package _exception._exception_3;

/**
 * Created by Vad on 07.07.2016.
 */
public class AutoCloseableClass implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("autoCloseableClass Closed.");
    }
}
