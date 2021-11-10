package task;

public enum Direction {
    North(0, -1),
    West(-1, 0),
    South(0, 1),
    East(1, 0);

    private int xcontrl;
    private int ycontrl;

    Direction(int xcontrl, int ycontrl) {
        this.xcontrl = xcontrl;
        this.ycontrl = ycontrl;
    }

    public Vector2 move(Vector2 start, double distance) {
        return new Vector2(start.getX() + distance * xcontrl, start.getY() + distance * ycontrl);
    }
}
