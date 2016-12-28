package rules.custom;

import java.util.logging.Logger;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestLogger implements TestRule {
    private Logger logger;

    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("TestLogger: before");
                logger = Logger.getLogger(description.getTestClass().getName() + '.' + description.getDisplayName());
                base.evaluate();
                System.out.println("TestLogger: after");
            }
        };
    }
}