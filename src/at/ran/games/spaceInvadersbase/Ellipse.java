package at.ran.games.spaceInvadersbase;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Ellipse implements SpaceActor {
    private float x,y;
    private float speed;

    public Ellipse(int x, int y) {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(100);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 20, 100);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Random random = new Random();
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;
        if(this.y > 600 || this.x >800) {
            this.x = random.nextInt(800);
            this.y = random.nextInt(600);

        }

    }
}
