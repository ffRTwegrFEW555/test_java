package _primitives._character;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Vad on 02.07.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        //
        char c = 'A';
        c++;
        System.out.println(c);

        //
        System.out.println();
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (Map.Entry map : charsets.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        //
        System.out.println();
        Charset currentCharset = Charset.defaultCharset();
        System.out.println(currentCharset);

        //
        System.out.println();
        String s = "Good news everyone! Так ведь?";
        byte[] buffer = s.getBytes();

        for (Byte b : buffer)
            System.out.println(b);

        //
        System.out.println();
        Charset koi8 = Charset.forName("KOI8-R");
        byte[] buffer2 = s.getBytes(koi8);

        for (Byte b : buffer2)
            System.out.println(b);

        //
        System.out.println();
        byte[] buffer3 = null;
        try {
            buffer3 = s.getBytes("windows-1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        for (Byte b : buffer3 != null ? buffer3 : new byte[0])
            System.out.println(b);
    }
}
