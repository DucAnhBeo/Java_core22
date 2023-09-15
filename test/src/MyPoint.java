import java.util.Scanner;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint point) {
        x = point.getX();
        y = point.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        double dx = secondPoint.getX() - x;
        double dy = secondPoint.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

