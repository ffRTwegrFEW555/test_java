package _string._string_format;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Vad on 25.05.2016.
 */
public class _TestDrive {

    public static void main(String[] args) {

        //
        // Date -- Устарел!
        // Calendar -- Используйте!
        //
        // Для текущих временных отметок используйте класс Date.
        // Для всего остального - Calendar.
        //

        //
        String numberOne = "1234";
        String numberTwo = "5678";

        int one = 1234;
        int two = 5678;

        //
        System.out.println(numberOne + numberTwo);
        System.out.println(Integer.parseInt(numberOne) + Integer.parseInt(numberTwo));

        System.out.println(one + two);
        System.out.println("" + one + two);

        //
        //
        System.out.println("");

        //
        Date date = new Date();
        String a = String.format("%tA, %tB, %td", date, date, date);
        System.out.println(a);
        String b = String.format("%tA, %<tB, %<td", date);
        System.out.println(b);

        //
        //
        System.out.println("");

        //
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR, 5);

        System.out.println(Calendar.HOUR);
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(calendar.HOUR_OF_DAY)); /*
                                                        Везде используются константы.
                                                        Их правильней вызывать через наименование класса,
                                                        Но можно и через объект. */
    }
}
