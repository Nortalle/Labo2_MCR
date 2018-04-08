import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * The class representing the display must implement a singleton and
 * implement the Displayer interface given in the appendix.
 */
public interface Displayer {

    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
    void addKeyListener(KeyAdapter ka);
}
