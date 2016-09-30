package _nio_20.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Vad on 24.07.2016.
 */
public class _Delete {
    public static void main(String[] args) {

        //
        Path path1 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2\\jopa_delete.txt");
        Path path2 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2_2");
        Path path3 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2_3");

        //
        ArrayList<Path> paths = new ArrayList<>();
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        //
        for (Path temp : paths) {
            System.out.println("----------------------------------");
            if (Files.exists(temp, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(Files.isDirectory(temp, LinkOption.NOFOLLOW_LINKS)
                                           ? "The directory exists: " + temp : "The file exists: " + temp);
                try {
                    Files.delete(temp);
                    // If the directory is not empty, it will throw (java.nio.file.DirectoryNotEmptyException)
                    System.out.println(Files.isDirectory(temp, LinkOption.NOFOLLOW_LINKS)
                                               ? "the directory is deleted"
                                               : "the file is deleted");
                } catch (IOException e) {
                    if (e instanceof java.nio.file.DirectoryNotEmptyException) {
                        System.out.println(Files.isDirectory(temp, LinkOption.NOFOLLOW_LINKS)
                                                   ? "the directory is not empty, can not be removed"
                                                   : "the file can not be removed");
                    }
                    else if (e instanceof java.nio.file.NoSuchFileException) {
                        System.out.println("The file/directory does not exist: " + temp);
                    }
                }
                // Files.deleteIfExists(temp);
                // In this case, if the file is missing, it does not throw an exception
            }
            else
                System.out.println("The file/directory does not exist: " + temp);
            System.out.println();
        }
    }
}
