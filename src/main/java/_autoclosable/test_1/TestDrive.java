package _autoclosable.test_1;

import java.io.*;

/**
 * Created by USER on 07.12.2016, 16:35.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class TestDrive {

    public static void main(String[] args) {

        String fileName = "f:/1.txt";
        TestDrive.openFileOne(fileName);
        TestDrive.openFileTwo(fileName);
        TestDrive.openFileThree(fileName);

        // stream.close() nowhere, but after executing the methods -- stream auto closed;
        // but anyway, we must to manually close the streams;
    }

    private static void openFileOne(String file) {
        try {
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(new byte[]{12, 124, 111});
        } catch (IOException e) {
            System.out.println("openFileOne error");
            e.printStackTrace();
        }
    }

    private static void openFileTwo(String file) {
        try {
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(new byte[]{52, 24, 50});
        } catch (IOException e) {
            System.out.println("openFileTwo error");
            e.printStackTrace();
        }
    }

    private static void openFileThree(String file) {
        try {
            InputStream inputStream = new FileInputStream(file);
            System.out.println(inputStream.read());
        } catch (IOException e) {
            System.out.println("openFileThree error");
            e.printStackTrace();
        }
    }
}
