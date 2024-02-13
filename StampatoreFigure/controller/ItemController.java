package application.controller;

import application.model.Creators.CreateItems;
import application.model.ItemsList;
import application.model.Products.Item;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ItemController extends MouseAdapter {
    private final JPanel panel;
    public ItemController(JPanel panel) {
        this.panel = panel;
    }

    long start;
    public void mousePressed(MouseEvent e) {
        start = System.currentTimeMillis();
    }

    public void mouseReleased(MouseEvent e) {

        Item item= CreateItems.getInstance().MakeItem(e.getX(), e.getY());
        ItemsList.getInstance().add(item);
    }
    public void update() {
        ItemsList.getInstance().update();
        panel.repaint();}
}
