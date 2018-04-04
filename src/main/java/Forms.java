import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forms extends JPanel {
    private List<BouncingForm> forms;
    private static Random r = new Random();

    public Forms() {
        forms = new ArrayList<BouncingForm>();
        int ballsToAdd = r.nextInt(60-10)+10;
        for (int i = 0; i < ballsToAdd; i++) {
            forms.add(new Square());
            forms.add(new Circle());
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (BouncingForm form : forms) {
            form.paint(g2d);
        }
        g2d.dispose();
    }

    public List<BouncingForm> getForms() {
        return forms;
    }

}
