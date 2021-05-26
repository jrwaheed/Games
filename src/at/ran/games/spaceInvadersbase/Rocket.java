package at.ran.games.spaceInvadersbase;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;

public class Rocket implements SpaceActor {
    private Image rocketImage;
    private float x, y;
    private Shape collisionShape;
    //Pulled here
    private List<CollisionActor> collisionShapes;


    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/Rocket1.png");
        this.rocketImage = tmp.getScaledCopy(50, 50);
        this.x = 400;
        this.y = 300;
        this.collisionShape = new Rectangle(this.x, this.y, 40, 50);
        //Pulled here
        this.collisionShapes = new ArrayList<CollisionActor>();
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y);
        graphics.draw(this.collisionShape);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        //Pulled here
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
            this.y--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
            this.y++;
        }
        this.collisionShape.setCenterX(this.x + 25);
        this.collisionShape.setCenterY(this.y + 25);

        for (CollisionActor shape: this.collisionShapes) {
            if (this.collisionShape.intersects(shape.getShape())) {
                System.out.println("Collision!");
            }
        }
    }

    public float getX() {
        return x + 20;
    }

    public float getY() {
        return y;
    }

    public void addCollisionPartner(Circle circle) {
        this.collisionShapes.add(circle);
    }


}

