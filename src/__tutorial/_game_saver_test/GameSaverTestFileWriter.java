package __tutorial._game_saver_test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Vad on 06.06.2016.
 */
public class GameSaverTestFileWriter {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Эльф", new String[]{"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Тролль", new String[]{"голые руки", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Маг", new String[]{"заклинания", "невидимость"});

        try {
            FileWriter fileWriter = new FileWriter("c:\\java\\serialization\\GameCharacterFileWriter.txt");
            fileWriter.write(one.getPower() + "," + one.getType() + "," + one.getWeapons() + "\r\n");
            fileWriter.write(two.getPower() + "," + two.getType() + "," + two.getWeapons() + "\r\n");
            fileWriter.write(three.getPower() + "," + three.getType() + "," + three.getWeapons() + "\r\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
