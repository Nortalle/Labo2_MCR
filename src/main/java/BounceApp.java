/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : BounceApp.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Main class of the labo, it implements all we need to run the app


 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/

import factories.EmptyShapeFactory;
import factories.FullShapeFactory;
import shapes.Bouncable;
import view.Display;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Main class, defines the number of shapes created per key pushed,
 * what key creates the shapes, and makes the shapes move
 */
public class BounceApp {
    private LinkedList<Bouncable> bouncers;

    /**
     * Constructor defines what key creates the shapes
     */
    public BounceApp() {
        final int NB_SHAPES = 10;

        bouncers = new LinkedList<>();

        Display.getInstance().setTitle("Bouncers");

        Display.getInstance().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case KeyEvent.VK_E : //if we press E, we clear the canvas
                        bouncers.clear();
                        break;
                    case KeyEvent.VK_B : //if we press B, we create NB_SHAPES empty circle and square
                        for (int i = 0; i < NB_SHAPES; i++) {
                            bouncers.add(EmptyShapeFactory.getInstance().produceCircle());
                            bouncers.add(EmptyShapeFactory.getInstance().produceSquare());
                        }
                        break;
                    case KeyEvent.VK_F : ///if we press F, we create NB_SHAPES full circle and square
                        for (int i = 0; i < NB_SHAPES; i++) {
                            bouncers.add(FullShapeFactory.getInstance().produceCircle());
                            bouncers.add(FullShapeFactory.getInstance().produceSquare());
                        }
                        break;
                    case KeyEvent.VK_Q : //if we press Q, we exit the app
                        System.exit(0);
                        break;
                }
            }
        });
    }

    /**
     * makes the shape move
     */
    public void loop() {
        new Timer(10, e -> {
            for(Bouncable bouncable : bouncers) {
                bouncable.move();
                bouncable.draw();
            }

            Display.getInstance().repaint();
        }).start();
    }

    /**
     * run the app
     */
    public static void main(String ... args) {
        new BounceApp().loop();
    }
}