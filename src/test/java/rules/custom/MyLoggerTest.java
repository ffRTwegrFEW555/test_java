package rules.custom;

import java.util.logging.Logger;

import org.junit.Rule;
import org.junit.Test;

public class MyLoggerTest {

    @Rule
    public TestLogger logger = new TestLogger();

    @Test
    public void checkOutMyLogger() {
        final Logger log = logger.getLogger();
        log.warning("Your test is showing!");
    }

}