package _exception._exception_3;

/**
 * Created by Vad on 07.07.2016.
 */
public class NewException
        extends Exception {
    public NewException() {
        super("JustNewException");

        // ------------------------------------------
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("        << " + i + " >>");

                    // Здесь можнол реализовать метод для отправки Сообщения об ошибке на электронную почту.
                    // Очень удобно.
                }

                System.out.println("Notification send to Administrator");
            }
        }).start();

        // ------------------------------------------
    }
}
