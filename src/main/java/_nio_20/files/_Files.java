package _nio_20.files;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Vad on 24.07.2016.
 */
public class _Files {
    public static void main(String[] args) {

        //
        for (LinkOption value : LinkOption.values())
            System.out.println(value);
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        //
        ArrayList<String> strings = new ArrayList<>();
        strings.add("temp_java_jopa");
        strings.add("nio1");
        strings.add("nio2");
        strings.add("jopa2.txt");

        //
        Path path1 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2");
        Path path2 = Paths.get("c:", strings.toArray(new String[strings.size()]));
        Path path3 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2\\nio3");
        Path path4 = Paths.get("c:\\temp_java_jopa\\nio1\\nio2\\nio3\\file.tmp");

        //
        ArrayList<Path> paths = new ArrayList<>();
        paths.add(path1);
        paths.add(path2);
        paths.add(path3);
        paths.add(path4);

        //
        for (Path temp : paths) {
            if (Files.exists(temp, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println("The file/directory exists: " + temp);
                if (Files.isDirectory(temp, LinkOption.NOFOLLOW_LINKS))
                    System.out.println(temp + " is a directory");
                else
                    System.out.println(temp + " is a file");
            }
            else
                System.out.println("The file/directory does not exist: " + temp);
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }
}
