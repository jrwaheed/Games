package at.ran.games.firstgameVererbung.actors;

import at.ran.games.firstgameVererbung.movement.LeftMoveStrategy;
import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {
    private MoveStrategy MoveStrategy;

    public Ellipse(int x, int y) {
        this.MoveStrategy = new LeftMoveStrategy(x,y,10f);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(MoveStrategy.getX(), MoveStrategy.getY(), 50, 10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.MoveStrategy.update(delta);
    }

}
