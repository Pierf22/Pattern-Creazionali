package application.model.Creators;

import application.model.Products.BlackBalls;
import application.model.Products.Item;

public class CreateBlackBalls extends CreateItems {
    CreateBlackBalls(){
        super();
    };

    public Item MakeItem(int x, int y) {
        return new BlackBalls(x, y);
    }
}
