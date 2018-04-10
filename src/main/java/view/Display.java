/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Display.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : class representing the display that implement a singleton and
               the Displayer interface

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * class representing the display that implement a singleton and
 * the Displayer interface
 */
public class Display implements Displayer {
    private final int DEFAULT_SIZE = 500;

    private JPanel container = new JPanel();
    private JFrame frame = new JFrame();
    private BufferedImage graphics;

    private static Display instance;

    /**
     * Private Constructor
     * Create the graphics where we draw And the Frame where we work
     */
    private Display() {
        graphics = createImage();
        frame.setSize(DEFAULT_SIZE, DEFAULT_SIZE);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(container);
        frame.setVisible(true);
    }

    private BufferedImage createImage() {
        return (BufferedImage)container.createImage(container.getWidth(), container.getHeight());
    }

    @Override
    public int getWidth() {
        return container.getWidth();
    }

    @Override
    public int getHeight() {
        return container.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) graphics.getGraphics();
    }

    @Override
    public void repaint() {
        container.getGraphics().drawImage(graphics, 0, 0, null);
        graphics = createImage();
    }

    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }

    /**
     * @return the instance
     */
    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }
}
