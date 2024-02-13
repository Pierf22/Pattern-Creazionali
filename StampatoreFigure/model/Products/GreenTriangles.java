package application.model.Products;

import application.Settings;

import java.awt.*;

public class GreenTriangles extends Item{
    private final int dimension=80;
    private final Color color=Color.GREEN;
    private  int directionX=30;
    private  int directionY=30;
    private int x, y;
    public GreenTriangles(int x, int y){
        this.x=x;
        this.y=y;
    }


    public void update() {
        if ((x <= 0 && directionX < 0) || (x+ dimension+20 >= Settings.WINDOW_WIDTH && directionX > 0))
            directionX = -directionX;

        x += directionX;

    }

    public void drawItem(Graphics g, Item p) {
        Polygon triangle=new Polygon(new int[]{x, x+(dimension/2), x+((dimension*2)/2)}, new int[]{y, y-dimension, y}, 3);
        g.fillPolygon(triangle);
        g.drawPolygon(triangle);
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
