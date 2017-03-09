package _method.override;

import java.io.FileNotFoundException;

/**
 * Created by USER on 02.03.2017, 21:16.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class B extends A {

    /*
        1. Модификатор доступа можно расширять;
        2. Тип возвращаемого значения можно сужать;
        3. Тип и порядок аргументов нельзя менять;
        4. Имена аргументов можно менять

        5. Бросаемые исключения:
            - можно не указывать вовсе;
            - можно указывать любые рантайм-исключения, даже если их нет у родителя;
            - можно указывать проверямые исключения родителя или наследуемые от них.
     */

    @Override
    public Integer get(int a2, String s) throws FileNotFoundException, RuntimeException {
        return null;
    }
}
