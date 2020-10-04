package com.babeex.balls.gui;

import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BallsPanel extends JPanel {

    private static final long serialVersionUID = 465960755048081148L;

    private static Logger logger = LoggerFactory.getLogger(BallsPanel.class);

    BallsPanel() {
        logger.debug("BallsPanel Default Constructor");
    }

}
