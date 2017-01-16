package _class.get_package;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by USER on 08.01.2017, 17:32.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class Package {
    public static void main(String[] args) {
        String path = Package.class.getPackage().getName().replaceAll("\\.", "/");
        Path newPath = Paths.get(path);
        newPath = newPath.getRoot();

        List<String> test;
        Number n;
        Integer nd;
    }
}
