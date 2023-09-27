import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {

        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        int k= new Scanner(System.in).nextInt();

        String newStr = s2.substring(0,k)+s1+s2.substring(k);
        System.out.println(newStr);

    }
}
