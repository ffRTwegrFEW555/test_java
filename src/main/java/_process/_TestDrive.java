package _process;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * Created by USER on 21.10.2016, 21:51.
 */
public class _TestDrive {
    public static void main(String[] args) {

        try {
            String line;
            Process p = Runtime.getRuntime().exec(System.getenv("windir")
                    + "\\system32\\"
                    + "tasklist.exe");
            // .exec(kill.exe)

            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
