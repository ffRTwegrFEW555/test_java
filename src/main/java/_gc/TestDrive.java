package _gc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Vad on 10.07.2016.
 */
public class TestDrive {
    public static void main(String[] args) {
        //
        // -XX:PermSize=64M -XX:MaxPermSize=128M -Xms128m -Xmx256m

        //
        ArrayList<Cat> cats = new ArrayList<>();

        //
        System.out.println("Before create a data. See used memory");
        System.out.println("Press Enter to continue");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        System.out.println();
        System.out.println("Add new Cat objects");
        for (int i = 0; i < 2_000; i++) {
            cats.add(new Cat());
        }

        System.out.println("_super.00 objects added. See used memory");
        System.out.println("Press Enter to continue");
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // gc - не понял результата.
//        System.out.println();
//        System.out.println("Run: System.gc();");
//
//        System.gc();
//        System.out.println("End stage #1. See used memory");
//        System.out.println("Press Enter to continue");
//        try {
//            bufferedReader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println();
        cats = null;

        // Почему-то виснет программа
        // System.gc();
        // System.out.println("End stage #_super. See used memory");

        System.out.println("cats = null;");
        System.out.println("Press Enter to continue");
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        System.out.println();
        System.out.println("cats cats..");

        boolean isAlive = true;
        boolean inversion = true;
        Cat cat;
        int count = 0;

        while (isAlive) {
            if (inversion) {
                cat = new Cat();
                inversion = false;
            }
            else {
                cat = null;
                inversion = true;
            }

            try {
                Thread.sleep(0);
                System.out.println("Next Cat: # " + ++count + " (" + cat + ")");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
