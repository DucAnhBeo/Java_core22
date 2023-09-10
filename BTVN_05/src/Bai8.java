import java.util.Scanner;

public class Bai8 {
    public static void Nhap(int n, int m, int[][] a) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void Xuat(int n, int m, int[][] a) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tinhTich(int[][] a, int[][] b, int m, int n, int m1) {
        int[][] c = new int[100][100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                int tt = 0;
                for (int k = 0; k < m; k++) {
                    tt = tt + (a[i][k] * b[k][j]);
                }
                c[i][j] = tt;
            }
        }
        Xuat(n, m1, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[100][100];
        Nhap(n, m, a);

        int n1, m1;
        n1 = sc.nextInt();
        m1 = sc.nextInt();
        int[][] b = new int[100][100];
        Nhap(n1, m1, b);

        System.out.println("________________");
        Xuat(n, m, a);
        System.out.println("_________________");
        Xuat(n1, m1, b);
        System.out.println("_________________");

        if (m == n1) {
            tinhTich(a, b, m, n, m1);
        } else {
            System.out.println("SAI");
        }
    }
}
