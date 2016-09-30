package _serialization.three;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Vad on 05.06.2016.
 */
public class Level_3 extends Level_2 {
    String level_3 = "Level_3";
    static int count;
    transient String transien_t_level_3 = "Level_3: Transient String";

    static {
        System.out.println("Level_3: static {}");
    }

    {
        System.out.println("Level_3: {}, count: " + ++count);
    }

    public Level_3() {
        System.out.println("public Level_3() {}");
    }

    void printText() {
        System.out.println(level_1);
        System.out.println(level_2);
        System.out.println(level_3);
        System.out.println(level);
        System.out.println("Level_1.levelTest = " + levelTest);
        System.out.println("transient level_1: " + transien_t);
        System.out.println("transient level_2: " + transien_t_level_2);
        System.out.println("transient level_3: " + transien_t_level_3);
        System.out.println("");
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Level_3: private void writeObject(ObjectOutputStream out)");
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        System.out.println("Level_3: private void readObject(ObjectInputStream in)");
    }
}
