package at.ran.games.spaceInvaders;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.ShapeFill;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Circle implements CollisionActor, SpaceActor, HitActor {
    private enum DIRECTION {UP,DOWN, LEFT, RIGHT};
    private float x;
    private float y;
    private float speed;
    private float diameter;
    private Shape collisionShape;
    private Shape hitShape;
    private List<HitActor> hitShapesList;
    private int health;


    public Circle(List<HitActor> hitShapesList) {
        Random random = new Random();
        this.hitShapesList = hitShapesList;
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
        this.collisionShape = new org.newdawn.slick.geom.Circle(this.x, this.y, this.diameter);
        this.hitShape = new org.newdawn.slick.geom.Circle(this.x, this.y, this.diameter);
        this.health = 1;

    }


    public void render(Graphics graphics){
        graphics.draw(this.collisionShape);
        graphics.setColor(Color.green);
    }


    public void update(GameContainer gameContainer, int delta) {
        Random random = new Random();
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
            this.diameter = random.nextInt(20) + 20;
        }

        this.collisionShape.setCenterY(this.y);
        this.hitShape.setCenterY(this.y);


        for (HitActor actor : this.hitShapesList) {
            System.out.println(actor);

            if /*(this.hitShape.intersects(actor.getHitShape()))*/
                (actor.getHitShape().intersects(this.hitShape)){
                    this.health = 0;
                        if(health <= 0)
                        {
                            this.x = 1000;
                            this.y = 1000;
                            actor.getHitShape().setY(1000);
                            actor.getHitShape().setX(1000);
                        }
                System.out.println("Hit");
            }
        }
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
