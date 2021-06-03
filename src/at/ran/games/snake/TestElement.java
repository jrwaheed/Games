package at.ran.games.snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class TestElement implements Actor{
    private int x;
    private int y;

    public TestElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.fillRect(this.x, this.y,40,40);
    }

    @Override
    public void update(int delta) {

    }
}
