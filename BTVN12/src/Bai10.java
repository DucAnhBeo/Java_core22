import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {

        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();

        String newStr = s2.replace(s1, "");
        System.out.println(newStr);
    }
}
