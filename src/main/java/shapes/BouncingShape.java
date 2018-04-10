/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : BouncingShape.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : abstract class that implements a shape that could be bounced
               against the border of a given window

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package shapes;

import view.Display;

import java.awt.geom.RectangularShape;
import java.awt.*;
import java.util.Random;

/**
 * Implements a shape that could be bounced against the border of a given
 * window which has a random speed and a random first position
 */
public abstract class BouncingShape implements Bouncable {

    /**
     * Size and speed authorised
     */
    private final int MAX_SIZE = 30;
    private final int MIN_SIZE = 8;
    private final int MAX_SPEED = 7;
    private final int MIN_SPEED = -7;

    protected float posX, posY;
    private int speedX, speedY;

    //The overall height/width of the BouncingShape.
    protected int size;

    private Color color;
    private Renderable renderer;
    private static Random random = new Random();

    /**
     * Constructor
     *
     * @param color    : Color of the BouncingShape
     * @param renderer : The Renderable that defines the way the square is drawn
     */
    public BouncingShape(Color color, Renderable renderer) {
        this.color = color;
        this.renderer = renderer;

        posX = random.nextInt(Display.getInstance().getWidth() + 1);
        posY = random.nextInt(Display.getInstance().getHeight() + 1);

        speedX = random.nextInt(MAX_SPEED + 1 - MIN_SPEED) + MIN_SPEED;
        speedY = random.nextInt(MAX_SPEED + 1 - MIN_SPEED) + MIN_SPEED;

        size = random.nextInt(MAX_SIZE + 1 - MIN_SIZE) + MIN_SIZE;
    }

    @Override
    public void draw() {
        getRenderer().display(Display.getInstance().getGraphics(), this);
    }

    @Override
    public void move() {
        Display instance = Display.getInstance();
        posX += speedX;
        posY += speedY;

        if (posX <= 0) {
            posX = 0;
            speedX = -speedX;
        } else if (posX > instance.getWidth() - size) {
            posX = instance.getWidth() - size;
            speedX = -speedX;
        }
        if (posY <= 0) {
            posY = 0;
            speedY = -speedY;
        } else if (posY > instance.getHeight() - size) {
            posY = instance.getHeight() - size;
            speedY = -speedY;
        }

        ((RectangularShape) getShape()).setFrame(posX, posY, size, size);
    }

    @Override
    public Renderable getRenderer() {
        return renderer;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
