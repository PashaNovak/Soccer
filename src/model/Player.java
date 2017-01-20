package model;

import java.awt.*;

public class Player {
    private static Sprite playerSprite;
    private int x;
    private int y;
    private int spriteSize;
    private Rectangle boundsPlayer;
    private PlayerDirection direction;

    public Player(int x, int y, PlayerDirection direction) {
        this.x = x;
        this.y = y;
        setBoundsPlayer(new Rectangle(getX(), getY(), getSpriteSize(), getSpriteSize()));
        this.direction = direction;
    }

    public static Sprite getPlayerSprite() {
        return playerSprite;
    }

    public static void setPlayerSprite(Sprite player) {
        Player.playerSprite = player;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpriteSize() {
        return spriteSize;
    }

    public void setSpriteSize(int spriteSize) {
        this.spriteSize = spriteSize;
    }

    public Rectangle getBoundsPlayer() {
        return boundsPlayer;
    }

    public void setBoundsPlayer(Rectangle boundsPlayer) {
        this.boundsPlayer = boundsPlayer;
    }

    public PlayerDirection getDirection() {
        return direction;
    }

    public void setDirection(PlayerDirection direction) {
        this.direction = direction;
    }
}
