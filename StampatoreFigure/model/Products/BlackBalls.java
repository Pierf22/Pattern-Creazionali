package application.model.Products;

import application.Settings;

import java.awt.*;

public class BlackBalls extends Item {


    private final int dimension=30;
    private final Color color=Color.BLACK;
    private  int directionX=10;
    private  int directionY=10;
    private int x, y;
    public BlackBalls(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void update() {
        if ((x <= 0 && directionX < 0) || (x+ dimension+20 >= Settings.WINDOW_WIDTH && directionX > 0))
            directionX = -directionX;
        if ((y <= 0 && directionY < 0) || (y+ dimension+40 >= Settings.WINDOW_HEIGHT && directionY > 0))
            directionY = -directionY;
        x += directionX;
        y += directionY;
    }


    public void drawItem(Graphics g, Item p) {

        g.fillOval(x, y, dimension, dimension);
    }
    public int getDimension() {
        return dimension;
    }

    public Color getColor() {
        return color;
    }

    public int getDirectionX() {
        return directionX;
    }

    public int getDirectionY() {
        return directionY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
