import java.awt.*;
import java.util.Random;

public class Circle extends BouncingForm {
    private static Random r = new Random();

    public Circle() {
        super(r.nextInt(Display.getWidth()), r.nextInt(Display.getHeight()), r.nextInt(30-10)+10, r.nextInt(10+10)-10, r.nextInt(10+10)-10, Color.blue);
    }

    protected void paint(Graphics2D g2d) {
        g2d.setColor(getColor());
        g2d.fillOval(getCenterX(), getCenterY(), getSize(), getSize());
    }
}
