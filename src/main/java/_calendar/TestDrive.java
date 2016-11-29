package _calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by USER on 26.11.2016, 13:58.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {
        //
        SimpleDateFormat date = new SimpleDateFormat("d.MM.YYYY");
        System.out.println(
                date.format(Calendar.getInstance().getTime())
        );
    }
}
