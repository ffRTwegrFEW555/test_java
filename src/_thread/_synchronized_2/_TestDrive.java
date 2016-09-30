package _thread._synchronized_2;

/**
 * Created by USER on 22.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) throws InterruptedException {

        //
        PrintTextOne printTextOne = new PrintTextOne();
        new Thread(new ЗадачаДляПотока(printTextOne)).start();
        new Thread(new ЗадачаДляПотока(printTextOne)).start();

        //
        Thread.sleep(3000);
        System.out.println();

        //
        PrintTextTwo printTextTwo = new PrintTextTwo();
        new Thread(new ЗадачаДляПотока(printTextTwo)).start();
        new Thread(new ЗадачаДляПотока(printTextTwo)).start();
    }
}
