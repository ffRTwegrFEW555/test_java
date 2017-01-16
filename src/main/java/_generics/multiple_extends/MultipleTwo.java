package _generics.multiple_extends;

import java.io.Serializable;
import java.util.List;

/**
 * Created by USER on 11.01.2017, 14:14.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class MultipleTwo<A, B extends Number & Serializable, C extends List<?>> {
}
