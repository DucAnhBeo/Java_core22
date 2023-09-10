import java.util.Scanner;

public class Bai7 {
    public static void inputArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int so = new Scanner(System.in).nextInt();

            boolean existed = false;
            for (int j = 0; j < i; j++) {
                if (so == a[j]) {
                    existed = true;
                    break;
                }
            }

            if (existed) {
                System.out.println("Nhap lai");
            } else {
                a[i] = so;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Nhap so phan tu");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        inputArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
