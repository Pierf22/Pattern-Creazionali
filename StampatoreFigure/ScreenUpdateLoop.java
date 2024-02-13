package application;

import application.controller.ItemController;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScreenUpdateLoop {
    private final ItemController controller;
    private final ScheduledExecutorService executorService =
            Executors.newSingleThreadScheduledExecutor();

    public ScreenUpdateLoop(ItemController controller) {
        this.controller = controller;
    }

    public void start() {
        executorService.scheduleAtFixedRate(() -> controller.update(), 0, 60, TimeUnit.MILLISECONDS);
    }
}
