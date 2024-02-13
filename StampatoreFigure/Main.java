package application;

import application.controller.ItemController;
import application.view.MainPanel;
import application.Settings;
import application.ScreenUpdateLoop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setUndecorated(true);
        f.setResizable(false);
        MainPanel p = new MainPanel();
        ItemController controller = new ItemController(p);
        p.setController(controller);
        f.add(p);
        ScreenUpdateLoop screenUpdateLoop = new ScreenUpdateLoop(controller);
        screenUpdateLoop.start();
        f.setVisible(true);
    }
}