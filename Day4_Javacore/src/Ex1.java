import java.util.Scanner;

public class Ex1 {
    public static long pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return pow(a, n - 1) * a;
    }


    public int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 1) + fib(n - 2);

    }

    public static int sum(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += i;
        }
        return s;
    }

    public static boolean chiaHet(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                return true;
            } else {
                return false;
            }
        }
       return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if (chiaHet(n)){
            System.out.println("1");
        }


    }
}
