package test_execution_order;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by USER on 28.12.2016, 9:36.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMethodOrder {

    @Test
    public void testB() {
        System.out.println("first");
    }
    @Test
    public void testA() {
        System.out.println("second");
    }
    @Test
    public void testC() {
        System.out.println("third");
    }
}
