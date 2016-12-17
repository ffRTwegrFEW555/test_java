package _socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by USER on 12.12.2016, 16:50.
 * Testing on testTask (Tomcat web-container)
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class HttpClient {
    public static void main(String[] args) throws IOException {

        // The host and port to be connected.
        String host = "192.168.201.128";
        int port = 80;

        // Create a TCP socket and connect to the host:port.
        Socket socket = new Socket(host, port);

        // Create the input and output streams for the network socket.
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Send request to the HTTP server.
        // Most of the settings can not be used.
        out.println("POST /test/users/update HTTP/1.1");
        out.println("Host: 192.168.201.128");
        out.println("Connection: keep-alive");
        out.println("Content-Length: 89");
        out.println("Accept: application/json, text/plain, */*");
        out.println("Origin: http://192.168.201.128");
        out.println("User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        out.println("Content-Type: application/json;charset=UTF-8");
        out.println("DNT: 1");
        out.println("Referer: http://192.168.201.128/test/users");
        out.println("Accept-Encoding: gzip, deflate");
        out.println("Accept-Language: ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4");

        out.println();   // blank line separating header & body

        out.println("{\"id\":\"4\",\"name\":\"Лепешева Ирина Алевна\",\"age\":\"32\",\"isAdmin\":\"false\"}");

        out.flush();

        // Read the response and display on console.
        FileWriter fileWriter = new FileWriter("f:/1.txt");
        String line;

        // readLine() returns null if server close the network socket.
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            fileWriter.write(line);
            fileWriter.write("\n");
        }

        // Close the I/O streams.
        in.close();
        out.close();
        fileWriter.close();
    }
}
