/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Bouncable.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Interface that defines methods for a object supposed to bounce
               against windows's borders

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package shapes;

import rendering.Renderable;

import java.awt.*;

/**
 *
 */
public interface Bouncable {

    /**
     * draws the BouncingShape in the Display the way the renderer defines it
     */
    void draw();

    /**
     * moves the Bouncing shape with her given speed, if it touches a border
     * it bounces against it
     */
    void move();

    /**
     * @return the renderer which defines the way it should be drawn
     */
    Renderable getRenderer();

    /**
     * @return the color of the shape
     */
    Color getColor();

    /**
     * @return the shape
     */
    Shape getShape();
}
