import java.util.Scanner;

public class Bai10 {
    public static int checkSCP(int a, int b) {
        Scanner sc = new Scanner(System.in);

        int[] e = new int[10000];
        int c = (int) Math.sqrt(a);
        int d = (int) Math.sqrt(b);
        int k = 0;

        if (c * c != a) c++;

        for (int i = c; i <= d; i++) {
            e[k] = i * i;
            k++;
        }
        System.out.println("Co tat ca so chinh phuong la" + " " + k);

        for (int i = 0; i < k; i++) {
            System.out.println(e[i]);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        checkSCP(a, b);
    }
}
