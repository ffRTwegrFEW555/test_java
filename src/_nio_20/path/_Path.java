package _nio_20.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Vad on 24.07.2016.
 */
public class _Path {
    public static void main(String[] args) {

        //
        Path path = Paths.get("c:", "temp_java_jopa", "jopa.txt");
        Path path2 = Paths.get("c:\\temp_java_jopa\\jopa.txt");
        Path path3 = Paths.get("/temp_java_jopa/jopa.txt");
        Path path4 = Paths.get("jopa.txt");
        Path path5 = Paths.get("c:\\temp_java_jopa");
        Path path6 = Paths.get("c:");
        Path path7 = Paths.get("c:\\//\\temp_java_jopa\\jopa..txt");
        Path path9 = Paths.get("temp_java_jopa");
        Path path10 = Paths.get("c:/");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("temp_java_jopa");
        strings.add("dir2");
        strings.add("dir3");
        strings.add("dir4");
        strings.add("jopa.txt");
        Path path8 = Paths.get("c:", strings.toArray(new String[strings.size()]));

        //
        System.out.println(path.getClass());
        System.out.println(path.toString());
        System.out.println();

        //
        System.out.println(path2.getClass());
        System.out.println(path2.toString());
        System.out.println();

        //
        System.out.println(path3.getClass());
        System.out.println(path3.toString());
        System.out.println();

        //
        System.out.println(path.compareTo(path2));
        System.out.println(path5.compareTo(path));
        System.out.println(path5.compareTo(path6));
        System.out.println();

        //
        System.out.println(path.endsWith("jopa.txt"));
        System.out.println(path.endsWith(path4));
        System.out.println(path.startsWith("c:"));
        System.out.println(path.startsWith("c:/"));
        System.out.println(path.startsWith("temp_java_jopa"));
        System.out.println(path.startsWith("c:/temp_java_jopa"));
        System.out.println(path.startsWith(path9));
        System.out.println(path.startsWith(path4));
        System.out.println(path.startsWith(path10));
        System.out.println(path.startsWith(path5));
        System.out.println();

        //
        System.out.println(path.equals(path2));
        System.out.println(path.equals(path6));
        System.out.println();

        //
        System.out.println(path.getFileName());
        System.out.println(path5.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(0));
        System.out.println(path.getName(1));
        System.out.println(path.getNameCount());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println();

        //
        System.out.println(path.isAbsolute());
        System.out.println(path4.isAbsolute());
        System.out.println(path5.isAbsolute());
        System.out.println();

        //
        System.out.println(path.normalize());
        System.out.println(path4.normalize());
        System.out.println(path5.normalize());
        System.out.println(path7.normalize());
        System.out.println();

        //
        System.out.println(path5.relativize(path8));
        System.out.println(path.relativize(path8));
        System.out.println();

        //
        System.out.println(path10.resolve(path9));
        System.out.println(path10.resolve(path9).resolve("intermediate").resolve(path4));
        System.out.println(path8.resolveSibling("demo.txt"));
        System.out.println();

        //
        System.out.println(path8.subpath(1, 3));
        System.out.println();

        //
        System.out.println(path.toAbsolutePath());
        System.out.println(path8.toAbsolutePath());
        System.out.println(path5.toAbsolutePath());
        System.out.println();

        //
        // System.out.println(path.toRealPath());
        // System.out.println(path8.toRealPath());
        // System.out.println(path5.toRealPath());
        // System.out.println();

        //
        System.out.println(path8.toFile());
        System.out.println(path5.toFile());
        System.out.println();

        //
        System.out.println(path8.toUri());
        System.out.println(path5.toUri());
        System.out.println(path4.toUri());
        System.out.println();

        //.....
        System.out.println(path.spliterator());
    }
}
