import java.util.Scanner;

public class Bai3 {
    public static int[] inputArray() {
        System.out.println("Nhap so phan tu");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = inputArray();
        int countPair = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i + 1]) {
                countPair++;
            }
            if (i < a.length - 2 && a[i] == a[i + 2]) {
                countPair++;
            }
        }
        System.out.println(countPair);
    }
}
