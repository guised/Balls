package com.babeex.balls.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainGui extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 774660094986554375L;

    private static Logger logger = LoggerFactory.getLogger(MainGui.class);

    /*
     * Main GUI components
     */

    BallsPanel ballsPanel;

    private BallsPanel getBallsPanel() {
        if (ballsPanel == null) {
            ballsPanel = new BallsPanel();
            ballsPanel.setBorder(BorderFactory.createEtchedBorder());
            ballsPanel.setBackground(Color.black);
        }
        return ballsPanel;
    }

    /**
     * Initialise the contents of the frame.
     */
    public void initialise() {
        setBounds(500, 100, 500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        URL iconURL = getClass().getResource("/icon.png");
        ImageIcon icon = new ImageIcon(iconURL);

        setIconImage(icon.getImage());
        setTitle("Balls!");

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
            }
        });

        getContentPane().setLayout(new BorderLayout());
        // getContentPane().add(getControlsPnl(), BorderLayout.PAGE_START);
        getContentPane().add(getBallsPanel(), BorderLayout.CENTER);
    }

}
