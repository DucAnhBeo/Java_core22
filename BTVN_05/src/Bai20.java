import java.util.Scanner;

public class Bai20 {
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
        int count = 0;
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) count++;
        }
        System.out.println("So lan xuat hien " + count);
    }
}
