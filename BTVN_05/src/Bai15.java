import java.util.Scanner;

public class Bai15 {
    public static int GCD(int m, int n) {
        if (n == 0) return m;
        return GCD(n, m % n);
    }

    public static void main(String[] args) {
        int m = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();

        if (GCD(m, n) == 1) {
            System.out.println("Nguyen to cung nhau");
        } else {
            System.out.println("khong nguyen to cung nhau");
        }

    }
}
