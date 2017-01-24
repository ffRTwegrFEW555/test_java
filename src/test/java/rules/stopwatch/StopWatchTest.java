package rules.stopwatch;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.concurrent.TimeUnit;

/**
 * Created by USER on 24.01.2017, 19:27.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class StopWatchTest {
    private static StringBuilder results = new StringBuilder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Rule
    // http://stackoverflow.com/questions/14892125/what-is-the-best-practice-to-determine-the-execution-time-of-the-bussiness-relev
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void finished(long nanos, Description description) {
            String result = String.format("%-25s %7d", description.getMethodName(), TimeUnit.NANOSECONDS.toMillis(nanos));
            results.append(result).append('\n');
            System.out.println(result);
        }
    };

    @AfterClass
    public static void printResult() {
        System.out.println(
                "\n---------------------------------" +
                "\nTest                 Duration, ms" +
                "\n---------------------------------\n" +
                results +
                "---------------------------------\n");
    }

    @Test
    public void testTrue() {
    }

    @Test
    public void testException() throws Exception {
        thrown.expect(Exception.class);
        throw new Exception();
    }
}
