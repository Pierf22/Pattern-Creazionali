package application.model.Products;

import application.Settings;

import java.awt.*;

public class BlueRectangles extends Item{
    private final int dimension=50;
    private final Color color=Color.BLUE;
    private  int directionX=20;
    private  int directionY=20;
    private int x, y;
    public BlueRectangles(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void drawItem(Graphics g, Item p) {

        g.fillRect(x, y, dimension, dimension);
    }

    public void update() {
        if ((y <= 0 && directionY > 0) || (y+ dimension+40 >= Settings.WINDOW_HEIGHT && directionY < 0))
            directionY = -directionY;
        if ((x <= 0 && directionX > 0) || (x+ dimension+20 >= Settings.WINDOW_WIDTH && directionX < 0))
            directionX = -directionX;
        x -= directionX;
        y -= directionY;
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
