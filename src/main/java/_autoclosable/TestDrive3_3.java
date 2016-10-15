package _autoclosable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestDrive3_3 {
    public static void main(String[] args) throws IOException {

        //
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        System.out.println(inputStreamReader);
        System.out.println(bufferedReader);

        //
        inputStreamReader.close();

        //
        System.out.println(inputStreamReader);
        System.out.println(bufferedReader);
    }
}
