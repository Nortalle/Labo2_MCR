/*
 ------------------------------------------------------------------------------
 Labo        : 3
 File        : Displayer.java
 Author(s)   : Samuel Mayor et Vincent Guidoux
 Date        : 10.04.2018

 Goal        : Displayer interface given in the labo

 Java        : 1.8.0_161
 ------------------------------------------------------------------------------
*/
package view;

import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * defines
 */
public interface Displayer {

    /**
     * @return the width of the Frame/Windows
     */
    int getWidth();

    /**
     * @return the height of the Frame/Windows
     */
    int getHeight();

    /**
     * @return the canvas where to draw in the Frame/Windows
     */
    Graphics2D getGraphics();

    /**
     * repaint the canvas
     */
    void repaint();

    /**
     * sets the title of the Frame/Windows
     *
     * @param s : title of the Frame/Windows
     */
    void setTitle(String s);

    /**
     * adds a key listener
     *
     * @param ka : Key listener to add
     */
    void addKeyListener(KeyAdapter ka);
}