import javax.swing.*;
import java.awt.*;

/**
 * class representing the display that implement a singleton and
 * implement the Displayer interface
 */
class Affichage extends JFrame implements Displayer {

    private static Affichage ourInstance = new Affichage();
    private static int width;
    private static int height;


    private Affichage() {
        width = 500;
        height = 500;

        setTitle("Labo2 Singleton Samuel Mayor et Vincent Guidoux");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(getWidth(), getHeight());
        setLocationRelativeTo(null);
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
        super.setTitle(s);
    }

    public static Affichage getInstance() {
        return ourInstance;
    }
}
