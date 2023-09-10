public class Bai16 {
    public static boolean STN(int n) {
        int sum = 0;
        int m = n;
        while (m > 0) {
            sum = sum * 10 + m % 10;
            m = m / 10;
        }
        return sum == n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean noFour(int n) {
        int m;
        while (n > 0) {
            m = n % 10;
            n = n / 10;
            if (m == 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 10000; i <= 9999999; i++) {
            if (STN(i) && isPrime(i) && noFour(i)) {
                System.out.println(i);
            }
        }
    }
}
