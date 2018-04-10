package rendering;

import shapes.Bouncable;
import shapes.Renderable;

import java.awt.*;

public class EmptyShapeRender implements Renderable {
    public void display(Graphics2D g, Bouncable b) {
        g.setStroke(new BasicStroke(2));
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
