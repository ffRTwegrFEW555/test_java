package parameterized_tests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

/**
 * Created by USER on 28.12.2016, 10:56.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
@RunWith(Parameterized.class)
public class SingleParameter {

    private static int test;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Annotation: beforeClass");
        test = 1;
    }

    @Before
    public void before() {
        System.out.println("Annotation: before");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Annotation: afterClass");
        test = 2;
    }

    @After
    public void after() {
        System.out.println("Annotation: after");
    }

    @Parameters(name = "count {index}: {0}")
    public static Iterable<?> data() {
        return Arrays.asList("first", "second", "third");
    }

    /*
        @Parameters
        public static Object[] data() {
            return new Object[] {"first", "second", "third"};
        }
    */

    @Parameter
    public String count;

    @Test
    public void test() {
        System.out.println(count);
        System.out.println(test);
    }


}
