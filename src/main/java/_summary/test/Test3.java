package _summary.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 */
public class Test3 {
    public static void main(String[] args) {
//        TimeZone tz = TimeZone.getTimeZone("UTC");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX"); // Quoted "Z" to indicate UTC, no timezone offset
//        df.setTimeZone(tz);
//        String nowAsISO = df.format("2017-04-21T21:25:35+05:00");
        try {
            Date date = df.parse("2017-04-21T21:25:35+05:00");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
