package __tutorial._simple_chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Vad on 15.06.2016.
 */
public class SimpleChatClient {
    private JTextArea incoming;
    private JTextField outgoing;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;

    public static void main(String[] args) {
        new SimpleChatClient().go();
    }

    private void go() {
        //
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        JFrame frame = new JFrame("Simple chat client");
        JPanel panel = new JPanel();
        incoming = new JTextArea(30, 60);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane incomingScrollPane = new JScrollPane(incoming);
        incomingScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        incomingScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        outgoing = new JTextField(40);
        JButton sendButton = new JButton("Send message");
        sendButton.addActionListener(new SendButtonListener());
        panel.add(incomingScrollPane);
        panel.add(outgoing);
        panel.add(sendButton);
        frame.getContentPane().add(panel);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        setUpNetworking();

        new Thread(new IncomingReader()).start();
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class SendButtonListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                printWriter.println(outgoing.getText());
                printWriter.flush();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    private class IncomingReader
            implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = bufferedReader.readLine()) != null) {
                    System.out.println("message readed: " + message);
                    incoming.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
