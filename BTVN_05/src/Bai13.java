import java.util.Scanner;

public class Bai13 {
    public static double sum(int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println(s);
        return 1;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        double result = sum(n);
    }
}
