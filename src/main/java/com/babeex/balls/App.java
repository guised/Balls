package com.babeex.balls;

import java.awt.EventQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.babeex.balls.gui.MainGui;

/**
 * Balls!
 *
 */
public class App {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Balls starting.");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainGui gui = new MainGui();
                    gui.initialise();
                    gui.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
