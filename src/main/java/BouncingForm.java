import javax.swing.*;
import java.awt.*;

public abstract class BouncingForm implements Bouncable, Renderable {

    private int centerX;
    private int centerY;
    private int size;
    private int speedX;
    private int speedY;
    private Color color;

    public BouncingForm(int centerX, int centerY, int size, int speedX, int speedY, Color color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.size = size;
        this.speedX = speedX;
        this.speedY = speedY;
        this.color = color;
    }

    public void move() {
        centerX += speedX;
        centerY += speedY;
        if (centerX <= 0 || centerX >= Display.getInstance().getWidth())
            speedX = -speedX;
        if (centerY <= 0 || centerY >= Display.getInstance().getHeight())
            speedY = -speedY;
    }

    /**
     * @return the coordinate x of the center
     */
    public int getCenterX() {
        return centerX;
    }

    /**
     * @return the coordinate x of the center
     */
    public int getCenterY() {
        return centerY;
    }

    public int getSize() {
        return size;
    }

    /**
     * @return the color of the bouncingForm
     */
    public Color getColor() {
        return color;
    }

    public Renderable getRenderer() {
        return null;
    }

    abstract protected void paint(Graphics2D g2d);


    public void display(Graphics2D g, Bouncable b) {

    }

    public void draw() {

    }

    public Shape getShape() {
        return null;
    }
}
