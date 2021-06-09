package at.ran.games.firstgameVererbung;

import at.ran.games.firstgameVererbung.actors.*;
import at.ran.games.firstgameVererbung.movement.LeftMoveStrategy;
import at.ran.games.firstgameVererbung.movement.MoveStrategy;
import at.ran.games.firstgameVererbung.movement.RightMoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StarTrek extends BasicGame {
    private List<Actor> actorsList;
    private Rocket rocket;


    public StarTrek(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();


/*
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), 50);
            actorsList.add(rectangle);
        }
*/
        for (int i = 0; i < 5; i++) {
            Circle circle = new Circle();
            actorsList.add(circle);
        }
/*
        RightCircle rc1 = new RightCircle();
        this.actorsList.add(rc1);

        LeftCircle lc1 = new LeftCircle();
        this.actorsList.add(lc1);
   */
        MoveStrategy rms1 = new RightMoveStrategy(50,50,10f);
        MoveStrategy lms = new LeftMoveStrategy(100,100,10f);
        MoveStrategy rms2 = new LeftMoveStrategy(400,400,20f);


            RectangleFilled rf = new RectangleFilled(lms);
            Ellipse el1 = new Ellipse(rms1);
            Ellipse el2 = new Ellipse(lms);
            Rectangle r1 = new Rectangle(rms2);
            this.actorsList.add(el1);
            this.actorsList.add(el2);
            this.actorsList.add(r1);
            this.actorsList.add(rf);
 /*
        Rocket rocket = new Rocket();
        this.rocket = rocket;
        this.actorsList.add(rocket);
  */
    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        //HERE IS ONE OF THE ADVANTAGES OF CREATING ACTORS. ALL OF THESE SHAPES ARE NOW DEFINED AS 'ACTORS',
        //WHICH MAKES IT POSSIBLE TO RUN THIS SINGLE LOOP FOR ALL OF THEM.


        for (Actor actor:this.actorsList) {
            actor.update(gameContainer, delta);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actorsList) {
            actor.render(graphics);
        }
    }

    @Override
    public void keyPressed(int key, char c) {
      if(key == Input.KEY_SPACE){
          System.out.println("BANG!");
          Cannonball cb =  new Cannonball(this.rocket.getX(), this.rocket.getY());
          this.actorsList.add(cb);
      };
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

