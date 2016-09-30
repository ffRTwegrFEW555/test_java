package _string._string_pool;

import java.util.Random;

/**
 * Created by Vad on 30.07.2016.
 */
public class StringPool2 {
    public static void main(String[] args) {
        //
        // -XX:PermSize=64M -XX:MaxPermSize=128M -Xms128m -Xmx256m

        Random r = new Random();
        while (true)
            String.valueOf(r.nextLong()).intern();
    }
}
