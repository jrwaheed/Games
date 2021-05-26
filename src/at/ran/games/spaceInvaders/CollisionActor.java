package at.ran.games.spaceInvaders;

import at.ran.games.spaceInvaders.SpaceActor;
import org.newdawn.slick.geom.Shape;

public interface CollisionActor extends SpaceActor {
    public Shape getShape();
}
