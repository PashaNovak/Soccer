package model;

import utils.Input;

import java.awt.*;

public interface Game {
    void start();

    void pause();

    Dimension getScreenSize();

    Input getInput();

    void setScene(Scene scene);
}
