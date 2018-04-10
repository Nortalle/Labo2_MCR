package factories;

import shapes.Circle;
import shapes.FullShapeRender;
import shapes.Square;

import java.awt.*;

public class FullShapeFactory extends ShapeFactory {
    private static FullShapeFactory instance;

    private FullShapeFactory() {}

    @Override
    public Circle produceCircle() {
        return new Circle(Color.blue, new FullShapeRender());
    }

    @Override
    public Square produceSquare() {
        return new Square(Color.yellow, new FullShapeRender());
    }

    public static ShapeFactory getInstance() {
        if (instance == null)
            instance = new FullShapeFactory();
        return instance;
    }
}
