import java.util.Scanner;

public class Bai14 {
    public static int printNum(int n) {
        for (int i = 1; i < n; i += 2) {
            System.out.println("Cac so le la" + " " + i);
        }
        for (int i = 2; i < n; i += 2) {
            System.out.println("Cac so chan la" + " " + i);
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int result = printNum(n);
    }
}
