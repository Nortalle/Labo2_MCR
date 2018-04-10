package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * class representing the display that implement a singleton and
 * implement the Displayer interface
 */
public class Display implements Displayer {
    private final int DEFAULT_SIZE = 500;

    private JPanel container = new JPanel();
    private JFrame frame = new JFrame();
    private BufferedImage graphics;

    private static Display instance;


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

    public int getWidth() {
        return container.getWidth();
    }

    public int getHeight() {
        return container.getHeight();
    }

    public Graphics2D getGraphics() {
        return (Graphics2D) graphics.getGraphics();
    }

    public void repaint() {
        container.getGraphics().drawImage(graphics, 0, 0, null);
        graphics = createImage();
    }

    public void setTitle(String s) {
        frame.setTitle(s);
    }

    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }

    public static Display getInstance() {
        if (instance == null)
            instance = new Display();
        return instance;
    }
}
