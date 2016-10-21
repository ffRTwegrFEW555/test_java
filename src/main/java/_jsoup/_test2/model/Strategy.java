package _jsoup._test2.model;

import _jsoup._test2.content.Section;

import java.util.List;

/**
 * Created by USER on 21.10.2016, 10:17.
 */
public interface Strategy {
    List<Section> getAllSections();

    List<Section> getResult();
}
