package _tests.test1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        int limit       = 15485863;
        int limitSqrt   = (int) Math.sqrt((double) limit);

        boolean[] sieve = new boolean[limit + 1];
        Arrays.fill(sieve, false);
        sieve[0]        = false;
        sieve[1]        = false;
        sieve[2]        = true;
        sieve[3]        = true;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        for (int x = 1; x <= limitSqrt; x++) {
            for (int y = 1; y <= limitSqrt; y++) {
                int n = (4 * x * x) + (y * y);

                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    sieve[n] = !sieve[n];
                }
                n = (3 * x * x) + (y * y);

                if (n <= limit && (n % 12 == 7)) {
                    sieve[n] = !sieve[n];
                }
                n = (3 * x * x) - (y * y);

                if (x > y && n <= limit && (n % 12 == 11)) {
                    sieve[n] = !sieve[n];
                }
            }
        }

        for (int n = 5; n <= limitSqrt; n++) {
            if (sieve[n]) {
                int x = n * n;
                for (int i = x; i <= limit; i += x) {
                    sieve[i] = false;
                }
            }
        }

        for (int i = 0; i <= limit; i++) {
            if (sieve[i]) {
                if (--count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
