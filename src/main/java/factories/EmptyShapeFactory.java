package factories;

import shapes.Circle;
import rendering.EmptyShapeRender;
import shapes.Square;

import java.awt.*;

public class EmptyShapeFactory extends ShapeFactory {
    protected static EmptyShapeFactory instance;

    private EmptyShapeFactory() {}

    @Override
    public Circle produceCircle() {
        return new Circle(Color.green, new EmptyShapeRender());
    }

    @Override
    public Square produceSquare() {
        return new Square(Color.red, new EmptyShapeRender());
    }

    public static ShapeFactory getInstance() {
        if (instance == null)
            instance = new EmptyShapeFactory();
        return instance;
    }
}
