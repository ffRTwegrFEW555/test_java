package _desktop;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by USER on 27.10.2016, 9:53.
 */
public class _TestDrive {
    public static void main(String[] args) {
        Desktop desktop = Desktop.getDesktop();
        try {
            // url
            URI url = new URI("http://e1.ru");
            desktop.browse(url);

            // any file
            File newFile = new File("c:/Users/USER/Desktop/test_from_java.txt");
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            desktop.open(newFile);

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
