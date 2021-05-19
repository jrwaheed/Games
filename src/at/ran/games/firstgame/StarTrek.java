package at.ran.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StarTrek extends BasicGame {
    private List<Actor> actorsList;


    public StarTrek(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), 50);
            actorsList.add(rectangle);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            actorsList.add(circle);
        }

        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(600), random.nextInt(600));
            actorsList.add(ellipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor:this.actorsList) {
            actor.update(delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actorsList) {
            actor.render(graphics);
        }
    }

        public static void main (String[] argv){
            try {
                AppGameContainer container = new AppGameContainer(new StarTrek("Rectangles"));
                container.setDisplayMode(800, 600, false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }

