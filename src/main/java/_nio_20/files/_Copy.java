package _nio_20.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

/**
 * Created by Vad on 24.07.2016.
 */
public class _Copy {
    public static void main(String[] args) {

        //
        ArrayList<String> strings = new ArrayList<>();
        strings.add("temp_java_jopa");
        strings.add("nio1");
        strings.add("nio2");
        strings.add("jopa2.txt");

        //
        Path source1 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2");
        Path source2 = Paths.get("c:", strings.toArray(new String[strings.size()]));
        Path destination1 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2_new");
        Path destination2 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2\\jopa2_new.tmp");

        //
        new _Copy().copyFile(source1, destination1); // only copied the directory without file, see Class "_CopyDirectoryWithFiles"
        new _Copy().copyFile(source2, destination2);
    }

    public void copyFile(Path source, Path destination) {

        //
        System.out.println("--------------------------");
        System.out.println("Trying to copy a file..");
        System.out.println("source:         " + source);
        System.out.println("destination:    " + destination);

        //
        if (!Files.exists(source)) {
            System.out.println("Source files does not exist");
            System.out.println();
            return;
        }

        //
        if (Files.exists(destination)) {
            System.out.println("Destination file already exists");
            System.out.println();
            return;
        }

        //
        try {
            Files.copy(source, destination,
                       StandardCopyOption.REPLACE_EXISTING, // Othwerwise if the file already exists --
                                                            // -- throw Exception --
                                                            // -- java.nio.file.FileAlreadyExistsException.
                       StandardCopyOption.COPY_ATTRIBUTES) ;
            System.out.println("Copying successfully");
        } catch (IOException e) {
            System.out.println("Copy failed: " + e.getCause());
        }
        System.out.println();
    }
}
