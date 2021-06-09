package at.ran.games.firstgameVererbung.actors;

import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

public class RectangleFilled extends AbstractMovableActor{

    public RectangleFilled(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.moveStrategy.getX(), this.moveStrategy.getY(),20,20);
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
