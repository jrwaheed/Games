package at.ran.games.snake;


import at.ran.games.spaceInvaders.SpaceInvaders;
import org.newdawn.slick.*;

import java.util.List;
import java.util.ArrayList;

public class SnakeGame extends BasicGame{
    public static final int GRID_SIZE = 40;
    private List<Actor> actorsList;
    private Element tail, tip;
    private int elapsedTime = 0;
    private static final int CLOCK = 500;


    public SnakeGame(String title){super(title);}

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();

        Element e1 = new Element(3,3);
        Element e2 = new Element(4,3);
        Element e3 = new Element(5,3);
        Element e4 = new Element(6,3);
        e1.setNext(e2);
        e2.setNext(e3);
        e3.setNext(e4);
        this.tail = e1;
        this.tip = e4;

        this.actorsList.add(e1);
        this.actorsList.add(e2);
        this.actorsList.add(e3);
        this.actorsList.add(e4);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actorsList) {
            actor.update(delta);
        }

        this.elapsedTime += delta;
        if(this.elapsedTime >= CLOCK){
            System.out.println("ping");


            Element tmp = this.tail;
            this.tail = tmp.getNext();
            tmp.setNext(null);
            tip.setNext(tmp);

            // movement
            int newX = this.tip.getX();
            int newY = this.tip.getY();

            //logic for direction
            newX++;
            tmp.setX(newX);
            tmp.setY(newY);

            //finalizing
            this.tip = tmp;
            this.elapsedTime = 0;

        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actorsList){
            actor.render(gameContainer, graphics);
        }
    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new SnakeGame("Snake Game"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
