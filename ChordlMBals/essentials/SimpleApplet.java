
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

//Make applet class public
public class SimpleApplet extends Applet {
    String text = "A wise man once said"; // the text to be printed

    // i assume its the first thing that runs
    public void init() {
        System.out.println("initing...");
        setBackground(Color.cyan);
    }

    // the thing that runs after init i guess
    public void start() {
        System.out.println("starting...");
    }

    // runs after initial close
    public void stop() {
        System.out.println("stopping...");
    }

    // runes after stop is done
    public void destroy() {
        System.out.println("preparing to unload...");
    }

    // draws the graphics i guess
    // note that the shape of the applet is
    // dedicated by the SimpleApplet.html
    // called twice for some reason -_-
    public void paint(Graphics g) {
        System.out.println("Paint");
        // getting size n stuff from some awt method, i have no idea how though
        // prolly from the applet ineheretance.
        g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
        g.setColor(Color.red); // text color (red on cyan, eyebleed has never been more fun).
        g.drawString(text, 15, 25); // writing text to the thing with x and y
    }

}