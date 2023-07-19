package main;

import javax.swing.*;

public class GameWindow {
    private JFrame frame;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GameWindow(GamePanel panel) {
        frame = new JFrame("Game");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
