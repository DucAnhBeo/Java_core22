import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = 0;
        int n;
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++) {
            s += a[i];
        }
        System.out.println(s);
        System.out.println(s);
    }
}
