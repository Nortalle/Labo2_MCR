import java.awt.*;

/**
 * The class representing the display must implement a singleton and
 * implement the Displayer interface given in the appendix.
 */
public interface Displayer {

    /**
     * @return the Graphics2D needed to draw some things
     */
    Graphics2D getGraphics();

    /**
     *  it's called to repaint everything
     */
    void repaint();

    /**
     * Set the title of the Displayer
     *
     * @param s : title to set
     */
    void setTitle(String s);
}
