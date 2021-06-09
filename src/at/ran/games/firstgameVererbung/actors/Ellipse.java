package at.ran.games.firstgameVererbung.actors;

import at.ran.games.firstgameVererbung.movement.LeftMoveStrategy;
import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import at.ran.games.firstgameVererbung.movement.RightMoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

public class Ellipse extends AbstractMovableActor {


    public Ellipse(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), 50, 10);
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
