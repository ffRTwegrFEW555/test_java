package _nio_20.files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by USER on 28.11.2016, 21:15.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class Temp {
    public static void main(String[] args) throws IOException {

        File file = new File("c:/document.txt");
        List<String> list = Files.readAllLines(file.toPath(), Charset.defaultCharset());
    }
}
