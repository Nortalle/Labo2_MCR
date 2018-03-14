import java.awt.*;

public class Affichage implements Displayer {
    private static Affichage ourInstance = new Affichage();

    public static Affichage getInstance() {
        return ourInstance;
    }

    private Affichage() {
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public Graphics2D getGraphics() {
        return null;
    }

    public void repaint() {

    }

    public void setTitle(String s) {

    }
}
