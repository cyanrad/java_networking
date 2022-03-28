package network;

import java.io.*;
import java.net.*;

public class TestServer {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(6969);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());

        String str = "";
        while (!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("client says: " + str);
        }
        din.close();
        s.close();
        ss.close();
    }
}
