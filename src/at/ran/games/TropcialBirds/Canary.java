package at.ran.games.TropcialBirds;
import org.newdawn.slick.geom.Shape;

import java.util.List;

public class Canary implements Actor{
    private String song;
    private int feathers;
    private boolean beak;
    private List<Actor> birdsList;




    public Canary(String song, int feathers, boolean beak) {
        this.song = song;
        this.feathers = feathers;
        this.beak = beak;
        this.birdsList = birdsList;

    }

    public static void main(String[] args) {


    }

    @Override
    public Shape getShape() {
        return null;
    }

    public int getFeathers() {
        return feathers;
    }
}
