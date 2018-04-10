/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Square.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Class that implements a square

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package shapes;

import rendering.Renderable;

import java.awt.geom.Rectangle2D;
import java.awt.*;

/**
 *  Defines a square, a 2D shape. Which can bounce
 */
public class Square extends BouncingShape {
    private Shape shape;

    /**
     * Constructor, call the BouncingShape constructor and define the shape
     *
     * @param color     : Color of the square
     * @param renderer  : The Renderable that defines the way the square is drawn
     */
    public Square(Color color, Renderable renderer) {
        super(color, renderer);
        shape = new Rectangle2D.Double(posX, posY, size, size);
    }

    /**
     * @return the shape
     */
    public Shape getShape() {
        return shape;
    }
}
