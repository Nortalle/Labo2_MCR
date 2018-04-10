/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : ShapeFactory.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Interface that defines The implementation of the design pattern:
               Factory Pattern

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package factories;

import shapes.Circle;
import shapes.Square;

/**
 * defines The implementation of the design pattern:
 * Factory Pattern
 */
public abstract class ShapeFactory {

    /**
     * @return a circle
     */
    public abstract Circle produceCircle();

    /**
     * @return a square
     */
    public abstract Square produceSquare();
}
