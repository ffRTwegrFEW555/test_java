package _tests.test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf   = new BufferedReader(new InputStreamReader(System.in));
        String input        = bf.readLine();
        char[] vowels       = {'a', 'e', 'i', 'o', 'u', 'y'};
        char v              = 0;
        char c              = 0;
        int vCount          = 0;
        int cCount          = 0;
        boolean check       = false;

        for (char ch : input.toCharArray()) {
            for (char cv : vowels) {
                if (ch == cv) {
                    vCount++;
                    if (v == 0) {
                        v = ch;
                    }
                    check = true;
                    break;
                }
            }

            if (!check) {
                cCount++;
                if (c == 0) {
                    c = ch;
                }

            }
            check = false;

            if (v != 0 && c != 0) {
                System.out.println(v > c ? "Vowel" : "Consonant");
                return;
            }
        }

        System.out.println(vCount > cCount ? "Vowel" : "Consonant");
    }
}

