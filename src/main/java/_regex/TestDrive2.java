package _regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by USER on 19.01.2017, 15:11.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive2 {
    public static void main(String[] args) {

        String line = "1000001001";
        Pattern pattern = Pattern.compile("(?=1(0+)1)");
        Matcher matcher = pattern.matcher(line);

        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
