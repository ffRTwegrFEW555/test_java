package __tutorial._daily_advice_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Vad on 09.06.2016.
 */
public class DailyAdviceServer {
    String[] adviceList = {"advice #1", "advice #_super", "advice #3", "advice #4", "advice #5", "advice #6", "advice #7"};

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }

    public void go() {
        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(4242);
                Socket socket = serverSocket.accept();

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                printWriter.println(adviceList[(int) (Math.random() * adviceList.length)]);
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
