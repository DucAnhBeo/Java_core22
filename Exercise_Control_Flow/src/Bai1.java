import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        int max;
        max=a;
        if(max<b) { max=b; }
        if( max<c) {max=c; }
        if( max<d) {max=d; }

        System.out.println(max);


    }
}
