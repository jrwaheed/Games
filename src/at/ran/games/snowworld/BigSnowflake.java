package at.ran.games.snowworld;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class BigSnowflake implements ActorSnowWorld{
    private float x;
    private float y;
    private float speed;
    private float diameter;

    public BigSnowflake() {
        Random random = new Random();


        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = 5;

        }


    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, 30,30);
    }

    @Override
    public void update(int delta) {
        Random random = new Random();
        this.y += (float)delta/this.speed;

        if(this.y > 600){
            this.y = 0;
        }

    }
}
