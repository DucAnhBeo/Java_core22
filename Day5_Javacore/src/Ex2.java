import java.util.Scanner;

public class Ex2 {
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


    public static void Result(int[] a, float x) {
        float k = Math.abs(x - a[0]);
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(x - a[i]) < k) {
                t = i;
                k = Math.abs(a[i] - x);
                System.out.println(a[i]);
            }
        }
    }

    // public static void inputArray

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = inputArray();

        System.out.println("Nhap x");
        int x;
        x = sc.nextInt();

        Result(a, x);


    }
}
