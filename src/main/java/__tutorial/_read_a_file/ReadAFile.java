package __tutorial._read_a_file;

import java.io.*;
/**
 * Created by Vad on 07.06.2016.
 */
public class ReadAFile {
    public static void main(String[] args) {

        //
        try {
            File file = new File("c:/java/serialization/QuizCardList-1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null)
                System.out.println(line);

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}