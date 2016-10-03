package _thread._thread;


/**
 * Created by USER on 02.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}
