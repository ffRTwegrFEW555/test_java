package _callable._void;

import java.util.concurrent.Callable;

/**
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 *          Created by USER on 23.11.2016, 15:26.
 */
public class Job implements Callable<String> {
    private String textToConsole = "World Wide Web";

    public String call() {
        System.out.println(textToConsole);

        return "Ok.";
    }
}
