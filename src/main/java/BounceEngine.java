import javax.swing.*;

public class BounceEngine implements Runnable {

    private Forms parent;

    public BounceEngine(Forms parent) {
        this.parent = parent;
    }

    public void run() {

        while (getParent().isVisible()) {

            // Repaint the balls pen...
            getParent().repaint();

            // This is a little dangrous, as it's possible
            // for a repaint to occur while we're updating...
            for (BouncingForm form : getParent().getForms()) {
                form.move();
            }

            // Some small delay...
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }

        }

    }

    public Forms getParent() {
        return parent;
    }
}