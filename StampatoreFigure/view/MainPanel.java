package application.view;

import application.controller.ItemController;
import application.model.ItemsList;
import application.model.Products.Item;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel() {
        this.setBackground(Color.WHITE);
    }

    public void setController(ItemController controller) {
        this.addMouseListener(controller);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Item p : ItemsList.getInstance().getItems()){
            g.setColor(p.getColor());
            p.drawItem(g, p);


        }
    }
}
