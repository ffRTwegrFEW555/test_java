package _thread._create;

/**
 * Created by USER on 21.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        // First way
        Thread printText = new Thread(new PrintText());
        printText.start();

        // Second way (Anonymous)
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (i == 10) {
                        try {
                            printText.join(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("=== Second way");
                }
            }
        }).start();

        // Third way
        // (Не совсем корректно так делать. Не совсем ООП. Используйте,
        // если хотите использовать более специфично фукнции потока-нити,
        // а не для выполнения задания.
        // Если необходимо просто выполнить задание, то используйте совместно с Раннабл)
        Thread printTextThird = new PrintTextThird();
        printTextThird.start();
    }
}
