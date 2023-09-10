import java.util.Scanner;

public class Bai21 {
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

    public static void Matrix(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] intArray2(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        return a;
    }

    public static void main(String[] args) {
        int[] a = inputArray();
        int[] b = inputArray();
        int[] matrixNew=intArray2();

        for (int i = 0; i < a.length; i++) {
            for (int j = b.length - 1; j >= 0; j--) {
                matrixNew[i]=a[i]+b[j];
            }
        }
        Matrix(matrixNew);
    }
}
