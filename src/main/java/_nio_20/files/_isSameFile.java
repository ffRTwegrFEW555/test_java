package _nio_20.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Vad on 24.07.2016.
 */
public class _isSameFile {
    public static void main(String[] args) throws IOException {

        //
        ArrayList<String> strings = new ArrayList<>();
        strings.add("temp_java_jopa");
        strings.add("nio1");
        strings.add("nio2");
        strings.add("jopa2.txt");

        //
        Path path1 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2\\jopa.txt");
        Path path2 = Paths.get("c:", strings.toArray(new String[strings.size()]));
        Path path3 = Paths.get("c:", "temp_java_jopa", "nio1", "nio2", "jopa3.txt");
        Path path4 = Paths.get("c:", "temp_java_jopa", "nio1", "nio2", "jopa.txt");

        //
        System.out.println("path1: " + path1);
        System.out.println("path2: " + path2);
        System.out.println("path3: " + path3);
        System.out.println("path4: " + path4);
        System.out.println();

        //
        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2)); // jopa1.txt == jopa2.txt, but not same file
        System.out.println("Files.isSameFile(path1, path3) is: " + Files.isSameFile(path1, path3)); // jopa1.txt != jopa3.txt, but not same file
        System.out.println("Files.isSameFile(path2, path3) is: " + Files.isSameFile(path2, path3)); // jopa2.txt != jopa3.txt, but not same file
        System.out.println("Files.isSameFile(path1, path4) is: " + Files.isSameFile(path1, path4)); // the same file
    }
}
