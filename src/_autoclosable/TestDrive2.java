package _autoclosable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        //
        br();
        System.out.println();
        System.out.println();
    }

    private static void br() throws IOException {
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader2.readLine());
    }
}
