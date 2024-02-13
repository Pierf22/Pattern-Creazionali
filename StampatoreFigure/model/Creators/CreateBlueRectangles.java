package application.model.Creators;

import application.model.Products.BlueRectangles;
import application.model.Products.Item;

public class CreateBlueRectangles extends CreateItems{
    CreateBlueRectangles(){
        super();
    };

    public Item MakeItem(int x, int y) {
        return new BlueRectangles(x,y);
    }
}
