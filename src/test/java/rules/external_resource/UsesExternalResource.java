package rules.external_resource;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * Created by USER on 28.12.2016, 12:16.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */

public class UsesExternalResource {
    private Server myServer = new Server();

    @Rule
    public ExternalResource resource = new ExternalResource() {
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

