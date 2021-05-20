package at.ran.games.snowworld;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Snowworld extends BasicGame {
    private List<ActorSnowWorld> actorsList;

    public Snowworld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actorsList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            BigSnowflake bigSnowflake = new BigSnowflake();
            actorsList.add(bigSnowflake);
        }

        for (int i = 0; i < 50; i++) {
            MediumSnowflake mediumSnowflake = new MediumSnowflake();
            actorsList.add(mediumSnowflake);
        }

        for (int i = 0; i < 50; i++) {
            SmallSnowflake smallSnowflake = new SmallSnowflake();
            actorsList.add(smallSnowflake);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for(ActorSnowWorld actorSnowWorld: this.actorsList){
            actorSnowWorld.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (ActorSnowWorld actorSnowWorld: this.actorsList) {
            actorSnowWorld.render(graphics);
        }
    }

    public static void main (String[] argv){
        try {
            AppGameContainer container = new AppGameContainer(new Snowworld("3D Snowflakes"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
