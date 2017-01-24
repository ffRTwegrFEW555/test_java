package _instanceof;

/**
 * Created by USER on 17.01.2017, 18:25.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Animal implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
