package at.ran.games.firstgameVererbung.movement;

public interface MoveStrategy {
    public float getX();
    public float getY();
    //public float getSpeed();
    public void update(int delta);

}
