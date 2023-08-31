import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int a,b,c,max;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        max=a;

        if(max<b) max=b;
        if(max<c) max=c;


        System.out.println(max);
    }
}
