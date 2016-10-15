package _autoclosable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive3 {
    public static void main(String[] args) {

        //
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        System.out.println();
        System.out.println();
    }
}
