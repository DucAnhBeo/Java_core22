import java.util.Arrays;
import java.util.Scanner;

public class Bai18 {
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

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}


