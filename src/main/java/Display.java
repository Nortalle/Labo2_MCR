import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * class representing the display that implement a singleton and
 * implement the Displayer interface
 */
class Display implements Displayer {

    private static Display ourInstance = new Display();
    private int width;
    private int height;

    private Display() {
        width = 500;
        height = 500;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Graphics2D getGraphics() {
        return null;
    }

    public void repaint() {

    }

    public void setTitle(String s) {

    }

    public void addKeyListener(KeyAdapter ka) {

    }

    public static Display getInstance() {
        return ourInstance;
    }
}
