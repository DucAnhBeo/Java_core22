public class Bai9 {
    public static boolean STN(int n) {
        int sum = 0;
        int m = n;
        while (m > 0) {
            sum = sum * 10 + m % 10;
            m = m / 10;
        }
        return sum == n;
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
        for (int i = 100000; i < 999999; i++) {
            if (STN(i) && soChiaHetMuoi(i)) {
                System.out.println(i);
            }

        }
    }
}
