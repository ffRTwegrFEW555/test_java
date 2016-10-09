package _date;

import java.util.Date;

/**
 * Created by USER on 08.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);

        System.out.println(date);
    }
}
