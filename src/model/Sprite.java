package model;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Sprite {
    String path;
    BufferedImage image;
    public int index = 0;
    private SpriteSheet sheet;
    private float scale;

    public Sprite(SpriteSheet sheet, float scale, String path, Boolean mode) {
        this.sheet = sheet;
        this.scale = scale;
        this.path = path;
        if (!mode) {
            image = sheet.getSheet();
        } else {
            image = sheet.getSprite(index);
        }

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void render(Graphics2D g, float x, float y) {
        System.out.println("htylth || Coordinaty " + x + " " + y);
        g.drawImage(image, (int) (x), (int) (y), (int) (image.getWidth()), (int) (image.getHeight()), null);
    }

}
