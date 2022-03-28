package network;

import java.io.*;
import java.net.*;

public class ChatClient {
    private static Socket client;

    public static void readServer() {
        try {
            String userInput = "";
            System.out.println(client.isConnected());
            DataOutputStream dout = new DataOutputStream(client.getOutputStream());
            BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));

            while (client.isConnected() && !userInput.equals("close channel")) {
                userInput = bufRead.readLine();
                dout.writeUTF(userInput);
                dout.flush();
            }

            dout.close();
            bufRead.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void sendServer() {
        try {
            String message = "";
            DataInputStream din = new DataInputStream(client.getInputStream());

            while (client.isConnected()) {
                message = din.readUTF();
                System.out.println("User: " + message);
            }

            din.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        client = new Socket("localhost", 6969); // >> Connecting to Server

        // >> stream setup
        Thread sender = new Thread() {
            @Override
            public void run() {
                readServer();
            }
        };

        Thread reciever = new Thread() {
            @Override
            public void run() {

            }
        };

        sender.start();
        reciever.start();
        sender.join();

        System.out.println(">> server: Closing Client");

        client.close();
    }
}