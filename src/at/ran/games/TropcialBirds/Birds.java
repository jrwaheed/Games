package at.ran.games.TropcialBirds;

import at.ran.games.spaceInvaders.Circle;
import at.ran.games.spaceInvaders.HitActor;
import at.ran.games.spaceInvaders.SpaceActor;

import java.util.ArrayList;
import java.util.List;

public class Birds {
    private List<Actor> actorList;



    public void macawRun(){
        this.actorList = new ArrayList<>();
        Canary canary1 = new Canary("Yellow","Tweet", 100, true);
       // Macaw macaw1 = new Macaw("Yellow","Tweet", 100, true);


        System.out.println(canary1.getFeathers());

        for (int i = 0; i < 5; i++) {
            Macaw macaw = new Macaw(this.actorList);
            System.out.println(this.actorList.size());
        }
    }

    public static void main(String[] args) {




    }
}
