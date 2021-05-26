package at.ran.games.spaceInvadersbase;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Cannonball implements SpaceActor {
    private float x,y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x + 4, this.y, 2,20);
        graphics.setColor(Color.red);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;

    }
}
