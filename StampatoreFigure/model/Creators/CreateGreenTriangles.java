package application.model.Creators;

import application.model.Products.GreenTriangles;
import application.model.Products.Item;

public class CreateGreenTriangles extends CreateItems{
    CreateGreenTriangles(){
        super();
    };

    public Item MakeItem(int x, int y) {
        return new GreenTriangles(x,y);
    }
}
