package rules.class_rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Created by USER on 28.12.2016, 16:54.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Test_2 {

    @Rule
    public TestName name = new TestName();

    @Test
    public void test_2() {
        System.out.println(name.getMethodName());
    }
}
