import java.util.Scanner;

public class Ex1 {
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

    // public static void inputArray

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = inputArray();
        //System.out.println("Nhap x");
        //int x = sc.nextInt();

        int max = a[0];
        int n = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
                n = i;
            }
        }
        System.out.println(max + "o vi tri" + n);
    }
}

