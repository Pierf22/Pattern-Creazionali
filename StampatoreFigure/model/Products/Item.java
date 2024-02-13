package application.model.Products;

import application.Settings;

import java.awt.*;


public abstract class Item {



    Item() {}

    public abstract int getDimension();

    public abstract Color getColor();


    public abstract int getX();

    public abstract int getY();

    public abstract void update();

    public abstract void drawItem(Graphics g, Item p);

}
