package _jsoup._test2;

import _jsoup._test2.model.Model;
import _jsoup._test2.model.Strategy;
import _jsoup._test2.view.GUI;
import _jsoup._test2.view.TypeGUI;

/**
 * Created by USER on 20.10.2016.
 */
public class Controller {
    private static TypeGUI typeGUI;

    private Controller() {}

    public static void startGUI(TypeGUI typeGUI) {
        Controller.typeGUI = typeGUI;

        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(() -> {
            GUI gui = TypeGUI.getGUIObject(typeGUI);
            if (gui != null) {
                gui.createAndShowGUI(new Model(gui));
            }
        });
    }

    public static void preparationParse(Model model, Strategy strategy) {
        model.preparation(strategy);
    }

    public static void startParse(Model model, Strategy strategy) {
        model.startParse(strategy);
    }

    public static void saveParseResult(Model model, Strategy strategy) {
        model.saveParseResult(strategy);
    }


}
