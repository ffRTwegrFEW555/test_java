package _math._bit_operation;

/**
 * Created by USER on 22.12.2016, 13:35.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        /*
            Задание
            Необходимо вычислить квадратный корень заданного натурального числа n с
            округлением вниз до ближайшего целого, не используя функций sqrt(n) и n^0.5. Например,
            для числа 14 результатом будет число 3, для числа 28 – число 5. Также необходимо
            привести краткую информацию об используемом алгоритме.
            Входные данные
            Произвольное натуральное число n.
            Выходные данные
            Квадратный корень заданного числа, округлённый вниз до ближайшего целого.
         */

        System.out.println(sqrt(14));
        System.out.println(sqrt(28));
        System.out.println();
        System.out.println(sqrt(35));
        System.out.println(sqrt(36));
        System.out.println(sqrt(37));

        /*
            Сделать с помощью побитовых операций
         */
    }

    private static int sqrt(int x) {
        int y = 0;
        int count = 0;

        while (y <= x) {
            y = ++count;
            y *= y;
        }

        return count - 1;
    }
}
