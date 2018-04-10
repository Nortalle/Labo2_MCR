/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Renderable.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Interface that defines a renderable object, an object what can
               be drawn

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package shapes;

import java.awt.*;

/**
 *  Interface that defines a renderable object, an object what can
 *  be drawn
 */
public interface Renderable {

    /**
     * displays the given bouncable object in the Graphics2D given
     *
     * @param g     : Where to draw
     * @param b     : What to draw
     */
    void display(Graphics2D g, Bouncable b);
}
