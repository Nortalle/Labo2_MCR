import java.awt.*;

public abstract class BouncingForm {

    private int centerX;
    private int centerY;
    private Color color;

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
}
