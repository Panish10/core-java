package com.panish.swing;

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends Frame {

    /*FrameDemo() {
        Container c = this.getContentPane();
    }*/

    public static void main(String[] args) {

        JFrame frame = new JFrame("My frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        MyPanel mp = new MyPanel();
        c.add(mp);

        /*JPanel jPanel = new JPanel();
        jPanel.getGraphics().setColor(Color.RED);
        jPanel.getGraphics().setFont(new Font("Helvetica", Font.BOLD, 34));
        jPanel.getGraphics().drawString("Hello Learners!", 50, 100);*/

        //jPanel.getGraphics().setColor(Color.RED);
        //jPanel.getGraphics().setFont(new Font("Helvetica", Font.BOLD, 34));
        //jPanel.getGraphics().drawString("Hello Learners!", 50, 100);


        //centerPanel.setLayout(new GridLayout(2, 2, 0, 0));

        //frame.add(jPanel);
    }
}

class MyPanel extends JPanel {

    MyPanel() {
        this.setBackground(Color.green);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica", Font.BOLD, 34));
        g.drawString("Hello Learners!", 50, 100);
    }
}