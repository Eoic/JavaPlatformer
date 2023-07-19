package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    private GamePanel panel;

    public Keyboard(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int vertical = 0;
        int horizontal = 0;

        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_W:
                vertical -= 1;
                break;
            case KeyEvent.VK_S:
                vertical += 1;
                break;
            case KeyEvent.VK_A:
                horizontal -= 1;
                break;
            case KeyEvent.VK_D:
                horizontal += 1;
                break;
            default:
                break;
        }

        panel.movePlayer(horizontal, vertical);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}
