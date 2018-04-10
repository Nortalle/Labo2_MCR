/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : EmptyShapeFactory.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Singleton which implements ShapeFactory. It creates empty shapes

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package factories;

import rendering.EmptyShapeRender;
import shapes.Circle;
import shapes.Square;
import java.awt.*;

/**
 * Singleton which implements ShapeFactory. It creates empty shapes
 */
public class EmptyShapeFactory extends ShapeFactory {
    protected static EmptyShapeFactory instance;

    /**
     * We define the default constructor private so we don't have a public
     * constructor
     */
    private EmptyShapeFactory() {}

    @Override
    public Circle produceCircle() {
        return new Circle(Color.green, new EmptyShapeRender());
    }

    @Override
    public Square produceSquare() {
        return new Square(Color.red, new EmptyShapeRender());
    }

    /**
     * @return the instance
     */
    public static ShapeFactory getInstance() {
        if (instance == null)
            instance = new EmptyShapeFactory();
        return instance;
    }
}
