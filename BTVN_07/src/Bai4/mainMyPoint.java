package Bai4;

import java.util.Scanner;

public class mainMyPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyPoint[] points = enterPoint();


        double max = 0;
        MyPoint point1 = null;
        MyPoint point2 = null;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = MyPoint.distance(points[i], points[j]);

                if (distance > max) {
                    max = distance;
                    point1 = points[i];
                    point2 = points[j];
                }
            }
        }

        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        //SAI
        System.out.println("Maximum distance: " + max);
    }


    public static MyPoint[] enterPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so diem");
        int n = sc.nextInt();
        MyPoint[] points = new MyPoint[n];

        for (int i = 0; i < n; i++) {
            points[i] = new MyPoint();
            points[i].enterInf();
        }
        return points;
    }


}
