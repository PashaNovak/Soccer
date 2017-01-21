package controller;

import model.Game;
import model.MainScene;
import view.DesktopGameBuilder;

import static model.Constants.DIMENSION;

public class DesktopLauncher {
    public static void main(String[] args) {
        Game game = DesktopGameBuilder.build(DIMENSION);
        game.setScene(new MainScene(game));
        game.start();
    }
}
