package at.ran.games.firstgameVererbung.actors;

import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor {
    private MoveStrategy moveStrategy;

    public Rectangle(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;


    }

    public void render(Graphics graphics){
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), 10,10);
    }

    public void update(GameContainer gameContainer, int delta) {
        moveStrategy.update(delta);
    }


}
