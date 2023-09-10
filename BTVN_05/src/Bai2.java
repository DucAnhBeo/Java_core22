public class Bai2 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean digitIsPrime(int n) {
        int m;
        while (n > 0) {
            m = n % 10;
            n = n / 10;
            if (isPrime(m)) return true;
        }
        return false;
    }

    public static boolean revNumIsPrime(int n) {
        int sum = 0;
        while (n > 0) {
            sum = n * 10 + n % 10;
            n = n / 10;
        }
        if (isPrime(sum)) return true;

        return false;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i < 9999999; i++) {
            if (isPrime(i) && digitIsPrime(i) && revNumIsPrime(i)) {
                System.out.println(i);
            }
        }
    }
}


