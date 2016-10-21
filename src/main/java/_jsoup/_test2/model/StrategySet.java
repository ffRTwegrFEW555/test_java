package _jsoup._test2.model;

/**
 * Created by USER on 21.10.2016, 12:51.
 */
public enum StrategySet {
    FIRST_SITE("First site"),
    SECOND_SITE("Second site");

    private String name;

    StrategySet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
