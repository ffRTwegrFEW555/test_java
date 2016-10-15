package _serialization.four;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Vad on 05.06.2016.
 */
public class Level_1 {
    String level_1 = "Level_1";
    String level = "Level";
    static int levelTest = 10;
    static int count;
    transient String transien_t = "Level_1: Transient String";

    static {
        System.out.println("Level_1: static {}");
    }

    {
        System.out.println("Level_1: {}, count: " + ++count);
    }

    public Level_1() {
        System.out.println("public Level_1() {}");
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Level_1: private void writeObject(ObjectOutputStream out)");
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        System.out.println("Level_1: private void readObject(ObjectInputStream in)");
    }
}
