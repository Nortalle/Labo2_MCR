/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : FullShapeRender.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Class that implements the Renderable interface. It defines that
               we want the shape to be full drawn

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package rendering;

import shapes.Renderable;
import shapes.Bouncable;

import java.awt.*;

/**
 * Class that implements the Renderable interface. It defines that
 * we want the shape to be full drawn
 */
public class FullShapeRender implements Renderable {

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
