package _jsoup._test2.view;

import _jsoup._test2.Controller;
import _jsoup._test2.model.Model;
import _jsoup._test2.content.Section;

import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:32.
 */
public abstract class GUI {
    private Model model;

    private void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void createAndShowGUI(Model model) {
        setModel(model);
        startGUI();
    }

    protected abstract void startGUI();

    public abstract void updateSections(List<Section> allSections);

    public abstract void updateParseResult(List<Section> result);
}
