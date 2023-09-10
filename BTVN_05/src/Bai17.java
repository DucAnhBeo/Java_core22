import java.util.Scanner;

public class Bai17 {
    public static int[][] inArray() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]");
                a[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        return a;
    }

    public static void Matrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] intArray2(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        return a;
    }

    public static void main(String[] args) {
        int[][] a = inArray();
        int[][] b = inArray();
        int[][] sum = intArray2();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Ma tran tong");
        Matrix(sum);


    }
}
