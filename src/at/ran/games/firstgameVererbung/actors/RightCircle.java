package at.ran.games.firstgameVererbung.actors;

import org.newdawn.slick.GameContainer;

import java.util.Random;

public class RightCircle extends Circle{

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Random random = new Random();
        this.x += (float) delta / this.speed;
        this.diameter = this.diameter/*+ .01f*/;
        if (this.x > 800) {
            this.x = 0;
            this.diameter = random.nextInt(20) + 20;

        }
    }
}
