package shapes;

import java.awt.*;

public class FullShapeRender implements Renderable {
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
