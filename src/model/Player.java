package model;

import java.awt.*;

public class Player {
    private static Sprite playerSprite;
    public int x = 0;
    public int y = 0;
    TextureAtlas textureAtlas;
    SpriteSheet spriteSheet;
    private int spriteSize;
    private Rectangle boundsPlayer;
    private PlayerDirection direction;
    private String PATH = "spriteSheet.png";

    public Player() {
        this.x = 400;
        this.y = 500;
        textureAtlas = new TextureAtlas(PATH);
        spriteSheet = new SpriteSheet(textureAtlas.cut(0, 0, 432, 48), 1 , 48);
        setDirection(PlayerDirection.LEFT);
        playerSprite = new Sprite(spriteSheet, spriteSheet.scale, PATH, true);
        setBoundsPlayer(new Rectangle(getX(), getY(), getSpriteSize(), getSpriteSize()));
    }

    public Sprite getPlayerSprite() {
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

    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
