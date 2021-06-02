package at.ran.games.spaceInvaders;

import at.ran.games.spaceInvaders.Cannonball;
import at.ran.games.spaceInvaders.Circle;
import at.ran.games.spaceInvaders.Rocket;
import at.ran.games.spaceInvaders.SpaceActor;
import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//checking revision
public class SpaceInvaders extends BasicGame {
    private List<SpaceActor> actorsList;
    private List<HitActor> hitActorList;
    private Rocket rocket;



    public SpaceInvaders(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();
        this.hitActorList = new ArrayList<>();

        Random random = new Random();

        at.ran.games.spaceInvaders.Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actorsList.add(rocket);


        for (int i = 0; i < 5; i++) {
            Circle circle = new Circle(this.hitActorList);
            actorsList.add(circle);

            this.rocket.addCollisionPartner(circle);

        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (at.ran.games.spaceInvaders.SpaceActor actor:this.actorsList) {
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
          Cannonball cannonball =  new Cannonball(this.rocket.getX(), this.rocket.getY());
          this.actorsList.add(cannonball);
          this.hitActorList.add(cannonball);

      }
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

