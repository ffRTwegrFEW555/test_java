package __tutorial._simple_chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Vad on 15.06.2016.
 */
public class VerySimpleChatServer {
    private ArrayList clientOutputStreams;

    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    }

    private void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while(true) {
                Socket socket = serverSocket.accept();
                clientOutputStreams.add(new PrintWriter(socket.getOutputStream()));

                new Thread(new ClientHandler(socket)).start();

                System.out.println("got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClientHandler implements Runnable {
        BufferedReader bufferedReader;

        public ClientHandler(Socket socket) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = bufferedReader.readLine()) != null) {
                    System.out.println("message readed: " + message);
                    tellEveryone(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void tellEveryone(String message) {
        for (Object outputStreamWriter : clientOutputStreams) {
            PrintWriter printWriter = (PrintWriter) outputStreamWriter;
            printWriter.println(message);
            printWriter.flush();
            System.out.println("message send: " + printWriter + ": " + message);

        }
    }

}
