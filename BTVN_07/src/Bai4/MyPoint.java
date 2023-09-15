package Bai4;

import java.util.Scanner;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {
        x=0;
        y=0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint point) {
        x = point.getX();
        y = point.getY();
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        double dx = point2.getX() - point1.getX();
        double dy = point2.getY() - point1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void enterInf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap toa do x");
         x = sc.nextDouble();

        System.out.println("Nhap toa do y");
         y = sc.nextDouble();

    }

}
