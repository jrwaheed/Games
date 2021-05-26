package at.ran.games.spaceInvadersbase;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface SpaceActor {
    public void render(Graphics graphics);
    public void update(GameContainer gameContainer,int delta);

}
