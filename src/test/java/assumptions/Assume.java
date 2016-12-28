package assumptions;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assume.*;
import static org.junit.Assert.*;


/**
 * Created by USER on 28.12.2016, 11:19.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Assume {

    private static int count;

    @BeforeClass
    public static void beforeClass() {
        assumeTrue(count == 0);
    }

    @Before
    public void before() {
        assumeTrue(++count <= 2);
    }

    @Test
    public void test() {
        assertEquals(2, 2);
    }

    @Test
    public void test2() {
        assertEquals(2, 2);
    }

    @Test
    public void test3() {
        assertEquals(2, 2);
    }

    @Test
    public void test4() {
        assertEquals(2, 2);
    }
}
