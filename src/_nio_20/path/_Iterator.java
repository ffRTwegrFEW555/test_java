package _nio_20.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Created by Vad on 24.07.2016.
 */
public class _Iterator {

    public static void main(String[] args) {
        //
        Path path = Paths.get("c:", "temp_java_jopa", "jopa.txt");
        // analogue: path path = Paths.get("c:\\temp_java_jopa\\jopa.txt");
        Path path2 = Paths.get("null", "temp_java_jopa", "plusOneDirectory", "jopa.txt");
        // analogue: path path = Paths.get("null\\temp_java_jopa\\plusOneDirectory\\jopa.txt");


        //
        Iterator iterator = path.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();

        //
        for (Object aPath : path2)
            System.out.println(aPath);
        System.out.println();

        //
        for (int i = 0; i < path2.getNameCount(); i++)
            System.out.println(path2.getName(i));
        System.out.println();

        //
        Iterator iterator2 = path.iterator();
        iterator2.forEachRemaining(System.out::println);
    }
}
