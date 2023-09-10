import java.util.Scanner;

public class Bai5 {
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

    public static int swap(int b, int c) {
        int tmp = b;
        b = c;
        c = tmp;

        return 1;
    }

    public static void main(String[] args) {

        int[] a = inputArray();

        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int s = 0;
        int dem = 0;

        if (b > c) {
            swap(b, c);
        }
        for (int i = b; i <= c; i++) {
            if (i >= 0 && i < a.length) {
                s += a[i];
                dem++;
            }
        }
        System.out.println(s);
        System.out.println(dem);
        System.out.println(s / dem);
    }
}
