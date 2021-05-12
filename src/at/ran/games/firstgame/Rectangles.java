package at.ran.games.firstgame;

import org.newdawn.slick.*;


public class Rectangles extends BasicGame {
    private float xCircle1, xCircle2, xSquare;
    private float yCircle1, yCircle2, ySquare;


    private float speed;

    public static boolean flipDownCircle1 = false;
    public static boolean flipLeftCircle2 = false;
    public enum DIRECTION {UP,DOWN, LEFT, RIGHT};
    public DIRECTION squareDirection = DIRECTION.RIGHT;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xCircle1 = 100;
        this.yCircle1 = 100;

        this.xCircle2 = 150;
        this.yCircle2 = 400;

        this.xSquare = 200;
        this.ySquare = 200;
        this.speed = 5f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        if (this.yCircle1 != 500 && flipDownCircle1 == false) {
            this.yCircle1++;
            if(this.yCircle1 == 500){
                flipDownCircle1 = true;
            }
        }

        if (this.yCircle1 != 100 && flipDownCircle1 == true) {
            this.yCircle1--;
            if(this.yCircle1 == 100){
                flipDownCircle1 = false;
            }
        }


        if (this.xCircle2 != 550 && flipLeftCircle2 == false) {
            this.xCircle2++;
            if(this.xCircle2 == 550){
                flipLeftCircle2 = true;
            }
        }

        if (this.xCircle2 != 150 && flipLeftCircle2 == true) {
            this.xCircle2--;
            if(this.xCircle2 == 150){
                flipLeftCircle2 = false;
            }
        }

        if (this.xSquare != 400 && squareDirection == DIRECTION.RIGHT) {
            this.xSquare = this.xSquare + 10;
            if(this.xSquare == 400){
                squareDirection = DIRECTION.DOWN;
            }
        }
        if (this.ySquare != 400 && squareDirection == DIRECTION.DOWN) {
            this.ySquare++;
            if(this.ySquare == 400){
                squareDirection = DIRECTION.LEFT;
            }
        }

        if (this.xSquare != 200 && squareDirection == DIRECTION.LEFT) {
            this.xSquare = this.xSquare - .5f;
            if(this.xSquare == 200){
                squareDirection = DIRECTION.UP;
            }
        }

        if (this.ySquare != 200 && squareDirection == DIRECTION.UP) {
            this.ySquare--;
            if(this.ySquare == 200){
                squareDirection = DIRECTION.RIGHT;
            }
        }



    }




/*



     this.x += (float) delta/this.speed;
*/



    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawOval(100,this.yCircle1,20,20);
        graphics.drawOval(this.xCircle2,100,50,20);
        graphics.drawRect(this.xSquare,this.ySquare,50,50);
        graphics.drawString("What the hell?",50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
