package at.ran.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor {
    private enum DIRECTION {LEFT, RIGHT};

    private float x;
    private float y;
    private float speed;
    private int directional;

    public Rectangle(int x, int y, float speed) {
        Random random = new Random();
        this.x = x;
        this.y = y;
        this.directional = random.nextInt(2);
        if(this.directional == 0){
            this.speed = -random.nextInt(30);
        } else {
            this.speed = random.nextInt(30);;
        }

    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x, this.y, 10,10);
    }

    public void update(GameContainer gameContainer, int delta) {
        Random random = new Random();

        if(this.x > 800 || this.x < 0){
            this.x = random.nextInt(800);

        }
        this.x += (float)delta/this.speed;
    }
}
