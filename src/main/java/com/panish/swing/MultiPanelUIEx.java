package com.panish.swing;

import javax.swing.*;
import java.awt.*;

public class MultiPanelUIEx {

    public static void main(String[] args) {

        // Create main frame
        JFrame frame = new JFrame("Multi Panel Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout for frame
        frame.setLayout(new BorderLayout());

        // ===== TOP PANEL =====
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);
        JLabel title = new JLabel("Welcome to My App");
        topPanel.add(title);

        // ===== CENTER PANEL =====
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2, 0, 0));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton reset = new JButton("Reset");

        centerPanel.add(b1);
        centerPanel.add(b2);
        centerPanel.add(b3);
        centerPanel.add(b4);
        centerPanel.add(reset);

        // ===== BOTTOM PANEL =====
        JPanel bottomPanel = new JPanel();
        JLabel status = new JLabel("Status: Ready");
        bottomPanel.add(status);

        // Add button action
        b1.addActionListener(e -> status.setText("Clicked Button1"));
        b2.addActionListener(e -> status.setText("Clicked Button2"));
        b3.addActionListener(e -> status.setText("Clicked Button3"));
        b4.addActionListener(e -> status.setText("Clicked Button4"));
        reset.addActionListener(e -> status.setText("Status: Ready"));

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Show frame
        frame.setVisible(true);
    }
}
