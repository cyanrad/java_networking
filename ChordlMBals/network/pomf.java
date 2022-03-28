package network;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class pomf {
    static String message = "";

    static void type() throws Exception {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        while (!message.equals("close")) {
            message = bufRead.readLine();
        }

        bufRead.close();
    }

    static void reply() throws Exception {
        while (!message.equals("close")) {
            if (message.equals("pomf")) {
                System.out.print("FBI OPEN UP");
            }
            TimeUnit.MILLISECONDS.sleep(200);
        }
    }

    public static void main(String[] args) throws Exception {
        Thread sender = new Thread() {
            @Override
            public void run() {
                try {
                    type();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        Thread reciever = new Thread() {
            @Override
            public void run() {
                try {
                    reply();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        sender.start();
        reciever.start();
        sender.join();
        reciever.join();
    }
}
