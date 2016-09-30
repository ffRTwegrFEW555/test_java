package _inputOutput;

import java.io.IOException;

/**
 * Created by Vad on 10.07.2016.
 */
public class SystemInOut {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1000];
            int n = System.in.read(buffer);

            // #1
            System.out.println(new String(buffer, 0, n));

            // #2
            System.out.write(buffer, 0, n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
