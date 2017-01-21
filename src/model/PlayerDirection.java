package model;

public enum PlayerDirection {
    UP,
    RIGHT,
    DOWN,
    LEFT,
    UP_RIGHT,
    UP_LEFT,
    DOWN_RIGHT,
    DOWN_LEFT;

    private int deltaX = 0;
    private int deltaY = 0;

    public void deltaX() {
        switch (this) {
            case LEFT:
                setDeltaX(-1);
            case RIGHT:
                setDeltaX(1);
            case UP_LEFT:
                setDeltaX(-1);
            case UP_RIGHT:
                setDeltaX(1);
            case DOWN_LEFT:
                setDeltaX(-1);
            case DOWN_RIGHT:
                setDeltaX(1);
            default:
                setDeltaX(0);
        }
    }

    public void deltaY() {
        switch (this) {
            case UP:
                setDeltaY(1);
            case DOWN:
                setDeltaY(-1);
            case UP_RIGHT:
                setDeltaY(1);
            case DOWN_RIGHT:
                setDeltaY(-1);
            case UP_LEFT:
                setDeltaY(1);
            case DOWN_LEFT:
                setDeltaY(-1);
            default:
                setDeltaY(0);
        }
    }

    public int getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(int deltaX) {
        this.deltaX = deltaX;
    }

    public int getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(int deltaY) {
        this.deltaY = deltaY;
    }

}
