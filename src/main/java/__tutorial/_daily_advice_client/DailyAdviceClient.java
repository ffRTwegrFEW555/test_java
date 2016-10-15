package __tutorial._daily_advice_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Vad on 09.06.2016.
 */
public class DailyAdviceClient {

    public static void main(String[] args) {
        DailyAdviceClient dailyAdviceClient = new DailyAdviceClient();
        dailyAdviceClient.go();
    }

    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
