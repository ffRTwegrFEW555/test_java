package rules.chain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runners.model.Statement;

import static org.junit.Assert.*;

/**
 * Created by USER on 28.12.2016, 17:05.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class UseRuleChain {
    @Rule
    public TestRule chain = RuleChain
            .outerRule((base, description) ->
                new Statement() {
                    @Override
                    public void evaluate() throws Throwable {
                        System.out.println("outerRule before");
                        base.evaluate();
                        System.out.println("outerRule after");
                    }
            })
            .around((base, description) ->
                    new Statement() {
                        @Override
                        public void evaluate() throws Throwable {
                            System.out.println("around One before");
                            base.evaluate();
                            System.out.println("around One after");
                        }
                    })
            .around((base, description) ->  {
                System.out.println("around Two");
                return base;
            });

    @Test
    public void example() {
        assertTrue(true);
    }
}
