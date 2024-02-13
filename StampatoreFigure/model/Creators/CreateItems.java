package application.model.Creators;

import application.model.Creators.CreateBlackBalls;
import application.model.Products.GreenTriangles;
import application.model.Products.Item;

public abstract class CreateItems {
    //Costruttore astratto
    private static CreateItems instance = null;


    protected CreateItems(){}

    public static CreateItems getInstance() {
        if(instance==null)   //valore da cambiare per stampare un'altro oggetto
            instance=new CreateBlueRectangles();
        return instance;
    }
    public abstract Item MakeItem(int x, int y);



}
