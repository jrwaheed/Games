package at.ran.games.spaceInvaders;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Circle implements CollisionActor, HitActor {
    private enum DIRECTION {UP,DOWN, LEFT, RIGHT};
    private float x;
    private float y;
    private float speed;
    private float diameter;
    private Shape collisionShape;
    private Shape hitShape;
    private List<HitActor> hitShapesList;


    public Circle() {
        Random random = new Random();

        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
        this.collisionShape = new org.newdawn.slick.geom.Circle(this.x, this.y, this.diameter);
        this.hitShape = new org.newdawn.slick.geom.Circle(this.x, this.y, this.diameter);
        this.hitShapesList = new ArrayList<HitActor>();
    }

    public void render(Graphics graphics){
        graphics.draw(this.collisionShape);
        graphics.setColor(Color.green);
    }

    public void update(GameContainer gameContainer, int delta) {

        Random random = new Random();
        this.y += (float)delta/this.speed;
        if(this.y > 600){
            this.y = 0;
            this.diameter = random.nextInt(20) + 20;
        }
        this.collisionShape.setCenterY(this.y);
        this.hitShape.setCenterY(this.y);


        }

    @Override
    public Shape getShape() {
        return collisionShape;
    }


    @Override
    public Shape getHitShape() {
        return hitShape;
    }

}
