import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        int a = 0, b = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println("Nhap a");
                a = new Scanner(System.in).nextInt();
                System.out.println("Nhap b");
                b = new Scanner(System.in).nextInt();

                isValid = true;
            } catch (InputMismatchException e1) {
                System.out.println("Nhap lai");
            }

            try {

                int c = b / a;
                System.out.println(c);

            } catch (ArithmeticException e2) {
                System.out.println("Khong the chia cho 0");
            }

            System.out.println("Day la code sau try-catch");
        }
    }
}
