package shapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends BouncingShape {
    private Shape shape;

    public Square(Color color, Renderable renderer) {
        super(color, renderer);
        shape = new Rectangle2D.Double(posX, posY, size, size);
    }

    public Shape getShape() {
        return shape;
    }
}
