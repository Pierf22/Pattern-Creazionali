package application.model;

import application.model.Products.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsList {
    private ItemsList() {

    }

    private static ItemsList instance=null;
    public static ItemsList getInstance(){
        if(instance==null){
            instance=new ItemsList();
        }
        return instance;
    }
    private final ArrayList<Item> items = new ArrayList<>();
    public List<Item> getItems() {
        return items;
    }
    public void update(){
        for(Item b : items) {
            b.update();
        }}

    public void add(Item item) {
        items.add(item);
    }
}
