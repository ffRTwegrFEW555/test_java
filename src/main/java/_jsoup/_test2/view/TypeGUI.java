package _jsoup._test2.view;

/**
 * Created by USER on 21.10.2016, 10:19.
 */
public enum TypeGUI {
    SWING,
    JAVAFX;

    public static GUI getGUIObject(TypeGUI typeGUI) {
        if          (typeGUI == SWING) {
            return new SwingGUI();
        } else if   (typeGUI == JAVAFX) {
            return new JavafxGUI();
        }
        return null;
    }
}
