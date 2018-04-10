/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : FullShapeFactory.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Singleton which implements ShapeFactory. It creates full shapes

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package factories;

import rendering.FullShapeRender;

import shapes.Circle;
import shapes.Square;

import java.awt.*;

/**
 * implements ShapeFactory. It creates full shapes
 */
public class FullShapeFactory extends ShapeFactory {
    private static FullShapeFactory instance;

    /**
     * We define the default constructor private so we don't have a public
     * constructor
     */
    private FullShapeFactory() {}

    @Override
    public Circle produceCircle() {
        return new Circle(Color.blue, new FullShapeRender());
    }

    @Override
    public Square produceSquare() {
        return new Square(Color.yellow, new FullShapeRender());
    }

    /**
     * @return the instance
     */
    public static ShapeFactory getInstance() {
        if (instance == null)
            instance = new FullShapeFactory();
        return instance;
    }
}
