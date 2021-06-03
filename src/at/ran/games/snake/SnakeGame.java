package at.ran.games.snake;


import org.newdawn.slick.*;

import java.util.List;
import java.util.ArrayList;

public class SnakeGame extends BasicGame{
    public static final int GRID_SIZE = 40;
    private List<Actor> actorsList;

    public SnakeGame(String title){super(title);}

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();

        Element e1 = new Element(3,3);
        Element e2 = new Element(3,3);
        Element e3 = new Element(3,3);
        Element e4 = new Element(3,3);



    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actorsList) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }

    public static void main(String[] args) {

    }
}
