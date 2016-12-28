package rules.class_rule;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by USER on 28.12.2016, 12:16.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */

@RunWith(Suite.class)
@SuiteClasses({Test_1.class, Test_2.class, Test_3.class})
public class UsesExternalResource {
    private static Server myServer = new Server();

    @ClassRule
    public static ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            myServer.connect();
        };

        @Override
        protected void after() {
            myServer.disconnect();
        };
    };

    @Test
    public void testFoo() {
        new Client().run(myServer);
    }
}

