import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int n = scanner.nextInt();

        // Create an array to store the points
        MyPoint[] points = new MyPoint[n];

        // Input the coordinates of each point
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the x-coordinate of point " + (i + 1) + ": ");
            double x = scanner.nextDouble();

            System.out.print("Enter the y-coordinate of point " + (i + 1) + ": ");
            double y = scanner.nextDouble();

            points[i] = new MyPoint(x, y);
        }

        // Find the two points with the maximum distance
        double maxDistance = 0;
        MyPoint point1 = null;
        MyPoint point2 = null;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = MyPoint.distance(points[i], points[j]);

                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = points[i];
                    point2 = points[j];
                }
            }
        }

        // Output the coordinates and distance
        System.out.println("Coordinates of the two points with the maximum distance:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Maximum distance: " + maxDistance);
    }
}