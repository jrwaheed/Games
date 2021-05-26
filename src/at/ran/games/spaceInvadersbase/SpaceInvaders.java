package at.ran.games.spaceInvadersbase;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpaceInvaders extends BasicGame {
    private List<SpaceActor> actorsList;
    private at.ran.games.spaceInvadersbase.Rocket rocket;


    public SpaceInvaders(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();

        Random random = new Random();
/*
        for (int i = 0; i < 10; i++) {
            at.ran.games.spaceInvaders.Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), 50);
            actorsList.add(rectangle);
        }
*/      Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actorsList.add(rocket);


        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle();
            actorsList.add(circle);
            this.rocket.addCollisionPartner(circle);
        }
/*
        for (int i = 0; i < 10; i++) {
            at.ran.games.spaceInvaders.Ellipse ellipse = new Ellipse(random.nextInt(600), random.nextInt(600));
            actorsList.add(ellipse);
        }
*/

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (SpaceActor actor:this.actorsList) {
            actor.update(gameContainer, delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (SpaceActor actor: this.actorsList) {
            actor.render(graphics);
        }
    }

    @Override
    public void keyPressed(int key, char c) {
      if(key == Input.KEY_SPACE){
          System.out.println("BANG!");
          at.ran.games.spaceInvadersbase.Cannonball cb =  new Cannonball(this.rocket.getX(), this.rocket.getY());
          this.actorsList.add(cb);
      };
    }

    public static void main (String[] argv){
            try {
                AppGameContainer container = new AppGameContainer(new SpaceInvaders("Space Invaders"));
                container.setDisplayMode(800, 600, false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }

