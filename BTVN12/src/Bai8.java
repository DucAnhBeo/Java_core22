import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {

        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();

        int find = s2.indexOf(s1);

        System.out.println(find);
    }
}
