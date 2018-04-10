package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends BouncingShape {
    private Shape shape;

    public Circle(Color color, Renderable renderer) {
        super(color, renderer);
        shape = new Ellipse2D.Double(posX, posY, size, size);
    }

    public Shape getShape() {
        return shape;
    }
}
