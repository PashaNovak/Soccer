package controller;

import model.Game;
import model.MainScene;
import view.DesktopGameBuilder;

import java.awt.*;
public class DesktopLauncher {
    public static void main(String[] args) {
        Game game = DesktopGameBuilder.build(new Dimension(640, 480));
        game.setScene(new MainScene(game));
        game.start();
    }
}
