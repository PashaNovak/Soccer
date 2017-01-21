package model;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    public int scale;
    private BufferedImage sheet;
    private int spriteCount;
    private int spritesInWidth;

    public SpriteSheet(BufferedImage sheet, int spriteCount, int scale) {

        this.sheet = sheet;
        this.spriteCount = spriteCount;
        this.scale = scale;

        this.spritesInWidth = sheet.getWidth() / scale;

    }

    public BufferedImage getSprite(int index) {

        //index = index % spriteCount;

        int x = index * spritesInWidth;
        int y = 0;

        return sheet.getSubimage(x, y, scale, scale);

    }

    public BufferedImage getSheet() {
        return sheet;
    }

    public void setSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }
}
