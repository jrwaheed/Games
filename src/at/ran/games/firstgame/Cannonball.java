package at.ran.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Cannonball implements Actor {
    private float x,y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x + 4, this.y, 1,10);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;

    }
}
