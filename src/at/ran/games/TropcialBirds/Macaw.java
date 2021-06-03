package at.ran.games.TropcialBirds;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;
import java.util.List;


    public class Macaw implements Actor{
        private String color;
        private String song;
        private int feathers;
        private boolean beak;
        private List<Actor> birdsList;




        public Macaw (List<Actor> birdsList) {
            this.song = song;
            this.feathers = feathers;
            this.beak = beak;
            this.birdsList = birdsList;

        }


        @Override
        public Shape getShape() {
            return null;
        }

        public int getFeathers() {
            return feathers;
        }
    }


