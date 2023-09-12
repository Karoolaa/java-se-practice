package pl.globallogic.exercises.intermediate;

public class Point {
    private int x;
    private int y;

    public Point() {
        // Konstruktor bezparametrowy
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int x, int y) {
        int xDifference = this.x - x;
        int yDifference = this.y - y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public double distance(Point another) {
        int xDifference = this.x - another.getX();
        int yDifference = this.y - another.getY();
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

