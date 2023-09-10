import java.util.Scanner;

public class Bai19 {
    public static int[] inputArray() {
        System.out.println("Nhap so phan tu");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = inputArray();
        int countChan = 0;
        int countLe = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) countChan++;
            else countLe++;
        }
        System.out.println("So chan la" + countChan);
        System.out.println("So le la" + countLe);
    }
}
