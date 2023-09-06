import java.util.Scanner;

public class Ex1 {
    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static boolean check_scp(int n) {
        double a = Math.sqrt(n);
        if (a * a == n)
            return true;
        else
            return false;
    }

    public static int scp(int n, int m) {
        int dem = 0;
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (check_scp(i)) {
                    return i;
                    dem++;
                }
            }
            return dem;
        }

        public static int STN ( int n){
            int m;


        }


        public static void main (String[]args){

        }
    }
