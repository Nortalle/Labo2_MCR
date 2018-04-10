import factories.EmptyShapeFactory;
import factories.FullShapeFactory;
import shapes.Bouncable;
import view.Display;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    public BounceApp() {
        final int NB_SHAPES = 10;

        bouncers = new LinkedList<>();

        Display.getInstance().setTitle("Bouncers");

        Display.getInstance().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E :
                        bouncers.clear();
                        break;
                    case KeyEvent.VK_B :
                        for (int i = 0; i < NB_SHAPES; i++) {
                            bouncers.add(EmptyShapeFactory.getInstance().produceCircle());
                            bouncers.add(EmptyShapeFactory.getInstance().produceSquare());
                        }
                        break;
                    case KeyEvent.VK_F :
                        for (int i = 0; i < NB_SHAPES; i++) {
                            bouncers.add(FullShapeFactory.getInstance().produceCircle());
                            bouncers.add(FullShapeFactory.getInstance().produceSquare());
                        }
                        break;
                    case KeyEvent.VK_Q :
                        System.exit(0);
                        break;
                }
            }
        });
    }
    public void loop() {
        new Timer(10, e -> {
            for(Bouncable bouncable : bouncers) {
                bouncable.move();
                bouncable.draw();
            }

            Display.getInstance().repaint();
        }).start();
    }
    public static void main(String ... args) {
        new BounceApp().loop();
    }
}