package rules.error_collector;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Created by USER on 28.12.2016, 12:25.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class UsesErrorCollectroTwice {

    private int a = 1;
    private int b = 2;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void example() {
        if (a == 1) {
            collector.addError(new Throwable("first thing went wrong"));
        }

        if (b == 2) {
            collector.addError(new Throwable("second thing went wrong"));
        }
    }
}
