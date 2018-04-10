package shapes;

import view.Display;

import java.awt.*;
import java.awt.geom.RectangularShape;
import java.util.Random;

public abstract class BouncingShape implements Bouncable {
    private final int MAX_SIZE = 30;
    private final int MIN_SIZE = 8;
    private final int MAX_SPEED = 10;
    private final int MIN_SPEED = -10;

    protected float posX, posY;
    private int speedX, speedY;
    protected int size;

    private Color color;
    private Renderable renderer;
    private static Random random = new Random();

    public BouncingShape(Color color, Renderable renderer) {
        this.color = color;
        this.renderer = renderer;

        posX = random.nextInt(Display.getInstance().getWidth()+1);
        posY = random.nextInt(Display.getInstance().getHeight()+1);

        size = random.nextInt(MAX_SIZE + 1 - MIN_SIZE)+MIN_SIZE;

        speedX = random.nextInt(MAX_SPEED + 1 - MIN_SPEED)+MIN_SPEED;
        speedY = random.nextInt(MAX_SPEED + 1 - MIN_SPEED)+MIN_SPEED;
    }

    public void draw() {
        getRenderer().display(Display.getInstance().getGraphics(), this);
    }

    public void move() {
        Display instance = Display.getInstance();
        posX += speedX;
        posY += speedY;

        if (posX <= 0 || posX >= instance.getWidth() - size) {
            if (posX < 0)
                posX = 0;
            else if (posX > instance.getWidth() - size)
                posX = instance.getWidth() - size;
            speedX = -speedX;
        }
        if (posY <= 0 || posY >= instance.getHeight() - size) {
            if (posY < 0)
                posY = 0;
            else if (posY > instance.getHeight() - size)
                posY = instance.getHeight() - size;
            speedY = -speedY;
        }

        ((RectangularShape)getShape()).setFrame(posX, posY, size, size);
    }

    public Renderable getRenderer() {
        return renderer;
    }

    public Color getColor() {
        return color;
    }
}
