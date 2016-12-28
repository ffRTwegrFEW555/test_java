package timeout;

import org.junit.Test;

/**
 * Created by USER on 28.12.2016, 10:16.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TimeoutTest {
    @Test(timeout = 3000)
    public void timeout() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test(timeout = 1000)
    public void timeoutTwo() {
    }
}
