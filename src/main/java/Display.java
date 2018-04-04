import javax.swing.*;
import java.awt.*;

/**
 * class representing the display that implement a singleton and
 * implement the Displayer interface
 */
class Display implements Displayer {

    private static Display ourInstance = new Display();
    private static int width;
    private static int height;
    private Container container;

    private Display() {
        width = 500;
        height = 500;
        container = new Container();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public Graphics2D getGraphics() {
        return null;
    }

    public void repaint() {

    }

    public void setTitle(String s) {

    }

    public static Display getInstance() {
        return ourInstance;
    }
}
