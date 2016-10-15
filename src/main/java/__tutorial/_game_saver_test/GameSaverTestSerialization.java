package __tutorial._game_saver_test;

import java.io.*;

/**
 * Created by Vad on 06.06.2016.
 */
public class GameSaverTestSerialization {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Эльф", new String[]{"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Тролль", new String[]{"голые руки", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Маг", new String[]{"заклинания", "невидимость"});

        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("c:\\java\\serialization\\GameCharacter.ser"));
            objectOutputStream.writeObject(one);
            objectOutputStream.writeObject(two);
            objectOutputStream.writeObject(three);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("c:\\java\\serialization\\GameCharacter.ser"));
            GameCharacter oneRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter twoRestore = (GameCharacter) objectInputStream.readObject();
            GameCharacter threeRestore = (GameCharacter) objectInputStream.readObject();
            objectInputStream.close();

            //
            System.out.println(oneRestore.getType());
            System.out.println(twoRestore.getType());
            System.out.println(threeRestore.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
