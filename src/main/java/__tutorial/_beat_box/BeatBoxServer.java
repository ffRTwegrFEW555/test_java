package __tutorial._beat_box;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Vad on 19.06.2016.
 */
public class BeatBoxServer {
    ArrayList<ObjectOutputStream> clientOutputStreams;

    public static void main(String[] args) {
        new BeatBoxServer().go();
    }

    public void go() {
        clientOutputStreams = new ArrayList<>();

        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            System.out.println("Wait for accept");

            while(true) {
                Socket socket = serverSocket.accept();
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                clientOutputStreams.add(out);

                Thread t = new Thread(new ClientHandler(socket));
                t.start();

                System.out.println("Got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class ClientHandler implements Runnable {
        ObjectInputStream ois;
        Socket socket;

        public ClientHandler(Socket socket) {
            try {
                this.socket = socket;
                ois = new ObjectInputStream(socket.getInputStream());
            }
            catch (Exception e) {
                System.out.println("Oops.");
            }
        }

        @Override
        public void run() {
            Object o1 = null;
            Object o2 = null;
            Float o3 = null;
            Long o4 = null;

            try {
                while ((o1 = ois.readObject()) != null) {
                    o2 = ois.readObject();
                    o3 = (Float) ois.readObject();
                    o4 = (Long) ois.readObject();

                    System.out.println("Read four objects");

                    System.out.println(o1);
                    System.out.println(o2);
                    System.out.println(o3);
                    System.out.println(o4);

                    tellEveryone(o1, o2, o3, o4);
                }
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void tellEveryone(Object o1, Object o2, Object o3, Object o4) {
        Iterator it = clientOutputStreams.iterator();
        while(it.hasNext()) {
            try {
                ObjectOutputStream out = (ObjectOutputStream) it.next();
                out.writeObject(o1);
                out.writeObject(o2);
                out.writeObject(o3);
                out.writeObject(o4);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
