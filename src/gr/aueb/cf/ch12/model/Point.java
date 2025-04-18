package gr.aueb.cf.ch12.model;

public class Point {
    private static int noOfPoints = 0;
    private int x;
    private int y;

    public Point() {
        noOfPoints ++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOfPoints ++;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int getNoOfPoints() {
        return noOfPoints;
    }
}
