public class BounceApp implements Runnable {

    private Forms parent;

    public BounceApp(Forms parent) {
        this.parent = parent;
    }

    public void run() {
        loop();
    }

    public void loop() {
        while (getParent().isVisible()) {

            getParent().repaint();

            for (BouncingForm form : getParent().getForms()) {
                form.move();
            }

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