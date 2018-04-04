import javax.swing.*;
import java.awt.*;

public abstract class BouncingForm {

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
     * sets the coordinate x of the center
     *
     * @param centerX : coordinate x of the center
     */
    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    /**
     * @return the coordinate x of the center
     */
    public int getCenterY() {
        return centerY;
    }

    /**
     * sets the coordinate v of the center
     *
     * @param centerY : coordinate y of the center
     */
    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public void setSize(int size) {
        this.size = size;
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

    /**
     * sets the color of the bouncingForm
     *
     * @param color : color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    abstract protected void paint(Graphics2D g2d);
}
