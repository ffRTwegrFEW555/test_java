package rules.custom;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class IdentityRule implements TestRule {
    @Override
    public Statement apply(final Statement base, final Description description) {
        return base;
    }
}