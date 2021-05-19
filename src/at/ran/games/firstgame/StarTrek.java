package at.ran.games.firstgame;

import org.newdawn.slick.*;

public class StarTrek extends BasicGame {
    private Rectangle rectangle;

    public StarTrek(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100, 100, 5);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.rectangle.update(delta);

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new FirstShapes("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
