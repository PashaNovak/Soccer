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

    public int deltaX() {
        switch (this) {
            case LEFT:
                return -1;
            case RIGHT:
                return 1;
            case UP_LEFT:
                return -1;
            case UP_RIGHT:
                return 1;
            case DOWN_LEFT:
                return -1;
            case DOWN_RIGHT:
                return 1;
            default:
                return 0;
        }
    }
    public int deltaY() {
        switch (this) {
            case UP:
                return 1;
            case DOWN:
                return -1;
            case UP_RIGHT:
                return 1;
            case DOWN_RIGHT:
                return -1;
            case UP_LEFT:
                return 1;
            case DOWN_LEFT:
                return -1;
            default:
                return 0;
        }
    }
}
