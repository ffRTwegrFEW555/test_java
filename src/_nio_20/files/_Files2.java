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
public class _Files2 {
    public static void main(String[] args) {

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
        for (Path temp : paths)
            System.out.printf(temp + ": Readable: %b, Writable: %b, Executable: %b \n",
                              Files.isReadable(temp),
                              Files.isWritable(temp),
                              Files.isExecutable(temp));
        System.out.println();

        //
        for (Path temp : paths) {
            System.out.println("----------------------------------");
            if (Files.exists(temp, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(Files.isDirectory(temp, LinkOption.NOFOLLOW_LINKS)
                                           ? "The directory exists: " + temp : "The file exists: " + temp);
                try {

                    // Interface BasicFileAttributeView
                    System.out.println("Creation time: "    + Files.getAttribute(temp, "creationTime"));
                    System.out.println("Last modified time: "
                                                            + Files.getAttribute(temp, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS));
                    System.out.println("Last access time: "
                                                            + Files.getAttribute(temp, "lastAccessTime", LinkOption.NOFOLLOW_LINKS));
                    System.out.println("Size: "             + Files.getAttribute(temp, "size") + " Bytes");
                    System.out.println("isDirectory: "      + Files.getAttribute(temp, "isDirectory"));
                    System.out.println("isRegularFile: "    + Files.getAttribute(temp, "isRegularFile"));
                    System.out.println("isSymbolicLink: "   + Files.getAttribute(temp, "isSymbolicLink"));
                    System.out.println("isOther: "          + Files.getAttribute(temp, "isOther"));
                    System.out.println("fileKey: "          + Files.getAttribute(temp, "fileKey"));
                    System.out.println();

                    // Interface AclFileAttributeView
                    // System.out.println("alc:acl: "           + Files.getAttribute(temp, "alc:acl"));
                    // System.out.println("alc:owner: "          + Files.getAttribute(temp, "alc:owner"));

                    // Interface DosFileAttributeView
                    System.out.println("dos:readonly: "     + Files.getAttribute(temp, "dos:readonly"));
                    System.out.println("dos:hidden: "       + Files.getAttribute(temp, "dos:hidden"));
                    System.out.println("dos:system: "       + Files.getAttribute(temp, "dos:system"));
                    System.out.println("dos:archive: "      + Files.getAttribute(temp, "dos:archive"));
                    System.out.println();

                    // Interface FileOwnerAttributeView
                    System.out.println("owner:owner: "      + Files.getAttribute(temp, "owner:owner"));
                    System.out.println();

                    // Interface PosixFileAttributeView
                    // System.out.println("posix:permissions " + Files.getAttribute(temp, "posix:permissions"));
                    // System.out.println("posix:group "       + Files.getAttribute(temp, "posix:group"));

                    // Interface UserDefinedFileAttributeView
                    //

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else
                System.out.println("The file/directory does not exist: " + temp);
            System.out.println();
        }
    }
}
