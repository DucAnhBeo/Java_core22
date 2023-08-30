import java.util.Scanner;

public class Bai5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();



        String newStr = s.replace (s1, s2);

        System.out.println(newStr);

    }
}