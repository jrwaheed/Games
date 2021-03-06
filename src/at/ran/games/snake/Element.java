package at.ran.games.snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;

public class Element implements Actor{
    private int x, y;
    private Element next;
    private ArrayList<Element> elementArrayList;





    public Element(int x, int y) {
        this.x = x;
        this.y = y;
        this.elementArrayList = elementArrayList;
    }

    @Override
    public void render(GameContainer container, Graphics graphics) {
        graphics.fillOval(this.x * SnakeGame.GRID_SIZE, this.y * SnakeGame.GRID_SIZE -1, SnakeGame.GRID_SIZE - 1,SnakeGame.GRID_SIZE - 1);

    }

    @Override
    public void update(int delta) {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Element getNext() {
        return next;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
