package _operators;

/**
 * Created by USER on 19.03.2017, 14:29.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Mark {
    public static void main(String[] args) {
        a1:
        {
            a2:
            {
                if (true) {
                    break a2;
                }
                System.out.println("Execute?");
            }
        }
    }
}
