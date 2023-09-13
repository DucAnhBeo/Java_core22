import java.util.Scanner;

public class Bai6 {
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

    public static boolean check(int[] a) {
        int i = 0;
        int j = a.length - 1;
        if (a.length % 2 != 0) {
            while (a[i] == a[j]) {
                i++;
                j--;
                if (i == j) break;
            }
            return true;
        }
        if (a.length % 2 == 0) {
            while (a[i] == a[j]) {
                i++;
                j--;
                break;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = inputArray();

        if (check(a)) {
            System.out.println("Dung la doi xung");
        } else
            System.out.println("Khong doi xung");

    }

}
