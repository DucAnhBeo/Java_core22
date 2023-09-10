import java.util.Scanner;

public class Bai4 {
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

    public static int findSecondMax(int[] a, int n) {
        int max;
        int secondMax;
        if (a[0] > a[1]) {
            max = a[0];
            secondMax = a[1];
        } else {
            max = a[1];
            secondMax = a[0];
        }

        for (int i = 2; i < n; i++) {
            if (a[i] >= max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = inputArray();

        int result = findSecondMax(a, a.length);
        System.out.println(result);
    }
}

