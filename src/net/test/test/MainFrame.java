package net.test.test;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public static void init() {

        JFrame frame = new JFrame("Cool Things");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().setSize(854, 480);

        JButton mainButton = new JButton("Click Here For Cool Things!");
        frame.getContentPane().add(mainButton, BorderLayout.CENTER);
    }
}
