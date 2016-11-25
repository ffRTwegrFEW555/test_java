package _serialization.two;

import java.io.*;

/**
 * Created by Vad on 05.06.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        Level_3 level_3_1 = new Level_3();
        Level_3 level_3_2 = new Level_3();
        Level_3 level_3_3 = null;
        Object level_object = null;

        String file = "f:\\home_dir\\vadim\\java\\projects\\_actual\\test_java\\temp\\files.ser";

        //
        System.out.println();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(level_3_2);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        System.out.println("");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            level_3_3 = (Level_3) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //
        System.out.println("");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            level_object = objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //
        System.out.println("");

        System.out.println("==== Before Serialization");
        level_3_2.printText();
        Level_1.levelTest = 12;
        level_3_2.level = "Level changed again";

        System.out.println("==== After Serialization");
        level_3_3.printText();

        /* Not access
        level_object.printText();
        */

        Level_1 level_1_1 = (Level_1) level_object;
        /* Not access
        level_1_1.printText();
        */
        Level_3 level_3_4 = (Level_3) level_object;
        level_3_4.printText();

        System.out.println("==== Before Serialization Again!");
        level_3_2.printText();
    }
}
