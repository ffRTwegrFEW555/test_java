package _serialization.one;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Vad on 05.06.2016.
 */
public class Level_2 extends Level_1 {
    String level_2 = "Level_2";
    static int count;
    transient String transien_t_level_2 = "Level_2: Transient String";

    /* impossible */
    // level = "Level changed";
    // Level_1.levelTest = 11;

    static {
        System.out.println("Level_2: static {}");
    }

    {
        System.out.println("Level_2: {}, count: " + ++count);

        /* possible */
        level = "Level changed";
        Level_1.levelTest = 11;
    }

    public Level_2() {
        System.out.println("public Level_2() {}");
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Level_2: private void writeObject(ObjectOutputStream out)");
    }

    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        System.out.println("Level_2: private void readObject(ObjectInputStream in)");
    }
}
