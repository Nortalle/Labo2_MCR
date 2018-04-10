/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Circle.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Class that implements a circle

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package shapes;

import rendering.Renderable;

import java.awt.geom.Ellipse2D;
import java.awt.*;

/**
 *  Defines a circle, a 2D shape. Which can bounce
 */
public class Circle extends BouncingShape {
    private Shape shape;

    /**
     * Constructor, call the BouncingShape constructor and define the shape
     *
     * @param color     : Color of the circle
     * @param renderer  : The Renderable that defines the way the circle is drawn
     */
    public Circle(Color color, Renderable renderer) {
        super(color, renderer);
        shape = new Ellipse2D.Double(posX, posY, size, size);
    }

    /**
     * @return the shape
     */
    public Shape getShape() {
        return shape;
    }
}
