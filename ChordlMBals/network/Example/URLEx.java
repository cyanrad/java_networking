package network.Example;

import java.net.*;
import java.io.*;

public class URLEx {

    public static void urlClassExample() {
        try {

            // >> creating a new URL
            URL url = new URL("http://www.javatpoint.com:8080/java-tutorial");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void urlConnectionExample() {
        try {
            // >> creating URL
            URL url = new URL("https://www.google.com/");
            // >> creating the connectin to the site
            URLConnection urlcon = url.openConnection();
            // >> input stream from the site
            InputStream stream = urlcon.getInputStream();

            // >> reading from site
            int i;
            while ((i = stream.read()) != -1) {
                // will be literal gibbrish cuz yeah
                System.out.print((char) i);
            }
        } catch (Exception e) {
            // will fail since the server does not auth
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        urlConnectionExample();
    }
}
