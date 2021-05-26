package at.ran.games.spaceInvaders;

import at.ran.games.spaceInvaders.SpaceActor;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

import java.util.Random;

public class Circle implements SpaceActor {
    private enum DIRECTION {UP,DOWN, LEFT, RIGHT};
    private float x;
    private float y;
    private float speed;
    private float diameter;
    private Shape collisionShape;

    public Circle() {
        Random random = new Random();

        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
        this.collisionShape = new org.newdawn.slick.geom.Circle(this.x, this.y, this.diameter);
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.x, this.y,this.diameter, this.diameter);
        graphics.setColor(new Color(100,100,100));
        graphics.draw(this.collisionShape);
        graphics.setColor(Color.green);
    }

    public void update(GameContainer gameContainer, int delta) {
        Random random = new Random();
        this.y += (float)delta/this.speed;
        //this.diameter = this.diameter + .01f;
        if(this.y > 600){
            this.y = 0;
            this.diameter = random.nextInt(20) + 20;
        }
        this.collisionShape.setCenterY(this.y);
    }

    public Shape getCollisionShape() {
        return collisionShape;
    }
}
