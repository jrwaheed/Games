package at.ran.games.firstgameVererbung.movement;

public class RightMoveStrategy implements MoveStrategy{
    private float x,y;
    private float speed;

    public RightMoveStrategy(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update (int delta){
        this.x += (float)delta/this.speed;
        if(this.x > 800){
            this.x = 0;
        }
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
