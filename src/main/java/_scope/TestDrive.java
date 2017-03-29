package _scope;

/**
 * Created by USER on 28.03.2017, 20:42.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    static {
        {
            {
                {
                    System.out.println("hello");
                }
            }
        }
    }

    public static void main(String[] args) {}
}
