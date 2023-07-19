package main;

import inputs.Keyboard;
import inputs.Mouse;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    private final Mouse mouseInputListener;
    private final Keyboard keyboardInputListener;
    double xDelta = 0;
    double yDelta = 0;
    double xPos = 375;
    double yPos = 275;

    public GamePanel() {
        mouseInputListener = new Mouse(this);
        keyboardInputListener = new Keyboard(this);
        addKeyListener(keyboardInputListener);
        addMouseListener(mouseInputListener);
        addMouseMotionListener(mouseInputListener);
    }

    public void movePlayer(int x, int y) {
        double magnitude = Math.sqrt(x * x + y * y);
        double xNorm = x / magnitude;
        double yNorm = y / magnitude;
        xPos += xNorm * 10;
        yPos += yNorm * 10;
        repaint();
    }

    public void setPlayerPosition(int x, int y) {
        xPos = x - 25;
        yPos = y - 25;
        repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect((int)xPos, (int)yPos, 50, 50);
    }
}
