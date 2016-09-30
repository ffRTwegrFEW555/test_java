package _serialization.four;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Vad on 05.06.2016.
 */
public class Level_4
        extends Level_3 implements Serializable{
    String level_4 = "Level_4";
    static int count;
    transient String transien_t_level_4 = "Level_4: Transient String";

    static {
        System.out.println("Level_4: static {}");
    }

    {
        System.out.println("Level_4: {}, count: " + ++count);
    }

    public Level_4() {
        System.out.println("public Level_4() {}");
    }

    void printText() {
        System.out.println(level_1);
        System.out.println(level_2);
        System.out.println(level_3);
        System.out.println(level_4);
        System.out.println(level);
        System.out.println("Level_1.levelTest = " + levelTest);
        System.out.println("transient level_1: " + transien_t);
        System.out.println("transient level_2: " + transien_t_level_2);
        System.out.println("transient level_3: " + transien_t_level_3);
        System.out.println("transient level_4: " + transien_t_level_4);
        System.out.println("");
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Level_4: private void writeObject(ObjectOutputStream out)");
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        System.out.println("Level_4: private void readObject(ObjectInputStream in)");
    }
}
