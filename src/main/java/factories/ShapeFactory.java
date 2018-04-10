package factories;

import shapes.Circle;
import shapes.Square;

public abstract class ShapeFactory {
    public abstract Circle produceCircle();
    public abstract Square produceSquare();
}
