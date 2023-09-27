import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args) {

        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();

        int find = s1.indexOf(s2);

        while (find >0){
            s1= s1.substring(0,find)+s1.substring(find+s2.length());
            find = s1.indexOf(s2);
        }
        System.out.println(s1);
    }
}
