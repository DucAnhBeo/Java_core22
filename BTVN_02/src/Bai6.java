import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);

    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    if(a*a+b*b==c*c)
    {
        double sin, cos;
        sin= (double) a/c;
        cos= (double) b/c;
        System.out.println((double)Math.round(sin* 100) /100);
        System.out.println((double)Math.round(cos* 100) /100);
    }


    }
}
