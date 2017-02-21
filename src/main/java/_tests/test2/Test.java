package _tests.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        /* AAACCBXXYYYYYYWWZAAA A3C2BX2Y6W2Z */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();

        if (chars.length > 0) {
            char temp = chars[0];
            int count = 1;

            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == temp) {
                    count++;
                } else {
                    result.append(chars[i - 1]);
                    result.append(count > 1 ? count : "");
                    count = 1;
                }
                temp = chars[i];
            }

            result.append(temp);
            result.append(count > 1 ? count : "");
        }

        System.out.print(result.toString());
    }
}
