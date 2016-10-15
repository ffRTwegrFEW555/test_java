package _life_of_variables;

/**
 * Created by USER on 25.09.2016.
 */
public class _TestDrive {

    public static void main(String[] args) {
        String s = null;
        if (s == null) {
            s = "A";

            int i = 10;
            i = 11;

            {
                s = "T";
                i = 12;

                int j = 20;
                j = 21;
            }

//            j = 22;
        }

        s = "Test";
//        i = 13;

    }
}
