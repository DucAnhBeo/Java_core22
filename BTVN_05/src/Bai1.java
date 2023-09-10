import java.util.Scanner;

public class Bai1 {
    public static boolean STN(int n) {
        int sum = 0;
        int m = n;
        while (m > 0) {
            sum = sum * 10 + m % 10;
            m = m / 10;
        }
        return sum == n;
    }

    public static boolean SMM(int n) {
        int m;
        while (n > 0) {
            m = n % 10;
            if (m != 0 && m != 6 && m != 8)
                return false;
            n = n / 10;
        }
        return true;
    }

    public static boolean soChiaHetMuoi(int n) {
        int m;
        int sum = 0;
        while (n > 0) {
            m = n % 10;
            n = n / 10;
            sum += m;
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {

        for (int i = 1000000; i <= 999999999; i++) {
            if (STN(i) && SMM(i) && soChiaHetMuoi(i)) {
                System.out.println(i);
            }
        }

    }
}
