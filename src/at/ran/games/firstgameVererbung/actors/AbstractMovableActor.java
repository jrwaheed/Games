package at.ran.games.firstgameVererbung.actors;

import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

public abstract class AbstractMovableActor implements CollisionActor {
    public AbstractMovableActor(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    protected MoveStrategy moveStrategy;

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.moveStrategy.update(delta);
    }



}
