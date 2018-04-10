/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : EmptyShapeRender.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Class that implements the Renderable interface. It defines that
               we want only the borders of the shape to be drawn

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package rendering;

import shapes.Renderable;
import shapes.Bouncable;

import java.awt.*;

/**
 * Class that implements the Renderable interface. It defines that
 * we want only the borders of the shape to be drawn
 */
public class EmptyShapeRender implements Renderable {

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setStroke(new BasicStroke(2));
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
