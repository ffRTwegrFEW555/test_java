package _jsoup._test2.model;

import _jsoup._test2.view.GUI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:17.
 */
public class Model {
    private GUI gui;

    public Model(GUI gui) {
        this.gui = gui;
    }

    public void preparation(Strategy strategy) {
        gui.updateSections(strategy.getAllSections());
    }

    public void startParse(Strategy strategy) {
        gui.updateParseResult(strategy.getResult());
    }

    public void saveParseResult(Strategy strategy) {

    }
}
