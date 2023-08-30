import java.util.Scanner;

public class Bai5a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       String str =sc.nextLine();
       char kitu =sc.next().charAt(0);

       int firstIndex =str.indexOf(kitu) ;
       int lastIndex = str.lastIndexOf(kitu);

       System.out.println(firstIndex);
       System.out.println(lastIndex);





    }
}
