package at.ran.games.snake;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;

public interface Actor {
    public void render(GameContainer gameContainer, Graphics graphics);
    public void update(int delta);
}
