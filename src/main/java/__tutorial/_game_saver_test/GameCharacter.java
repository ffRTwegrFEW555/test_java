package __tutorial._game_saver_test;

import java.io.Serializable;

/**
 * Created by Vad on 06.06.2016.
 */
public class GameCharacter
        implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";

        for (String s : weapons)
            weaponList += s + " ";

        return weaponList;
    }
}
