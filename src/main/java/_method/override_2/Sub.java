package _method.override_2;

/**
 * Created by USER on 31.03.2017, 13:03.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Sub extends Super {

    // not override
    public static void Static() {}

    // compilation error
    // public final void Final() {}

    // not override
    private void Private() {}

    // override
    @Override
    public void Public() {}
}
