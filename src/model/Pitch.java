package model;

public class Pitch {
    public int tvPopapsWidth = 510;
    public int tpPopapsLeftX = 360;
    public int tpPopapsRightX = 1050;
    public int tabloWidth = 180;
    public int tabloHeight = 55;
    public int tabloX = 870;
    public int tabloY = 35;
    private String PATH = "pitch.png";
    TextureAtlas textureAtlas = new TextureAtlas(PATH);
    SpriteSheet spriteSheet = new SpriteSheet(textureAtlas.getImage(), 1, 1);
    private int width;
    private int height;
    private Sprite pitch;

    Pitch() {
        pitch = new Sprite(spriteSheet, spriteSheet.scale, PATH, false);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sprite getPitch() {
        return pitch;
    }

    public void setPitch(Sprite pitch) {
        this.pitch = pitch;
    }
}
