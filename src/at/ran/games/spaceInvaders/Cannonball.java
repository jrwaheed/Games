package at.ran.games.spaceInvaders;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;

public class Cannonball implements SpaceActor, HitActor {
    private float x,y;
    private Shape hitShape;


    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
        this.hitShape = new Rectangle(this.x, this.y, 2,20);

    }

    @Override
    public void render(Graphics graphics) {
        //graphics.fillRect(this.x + 5, this.y - 5, 2,20);
        graphics.draw(this.hitShape);
        graphics.setColor(Color.red);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
        this.hitShape.setY(this.y--);




    }

    @Override
    public Shape getHitShape() {
        return hitShape;
    }

}
