package rules.test_watchman;

import static org.junit.Assert.*;
import static org.junit.Assume.*;


import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.Statement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WatchmanTest {
    private static String watchedLog;

    @Rule
    public TestRule watchman = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            watchedLog += description.getDisplayName() + " " + "success!\n";
        }

        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            watchedLog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
        }

        @Override
        protected void starting(Description description) {
            super.starting(description);
        }

        @Override
        protected void finished(Description description) {
            super.finished(description);
        }
    };

    // ====================
    @Test
    public void fails() {
        fail();
    }

    @Test
    public void succeeds() {
    }

    @Test
    public void skipped() {
        assumeTrue(watchedLog == null);
    }

    // ====================
    @AfterClass
    public static void afterClass() {
        System.out.println(watchedLog);
    }
}
