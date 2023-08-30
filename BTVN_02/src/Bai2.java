import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int delta;
        delta = b * b - 4 * a * c;

        double x1, x2;

        if (delta < 0)
            System.out.println("PT vo nghiem");
        if (delta == 0)
        {
            x1=x2= -b/(2*a) ;
            System.out.println(x1);
            System.out.println(x2);
        }
        if(delta>0)
        {
            x1=(-b-Math.sqrt(delta))/(2*a) ;
            x2=(-b+Math.sqrt(delta))/(2*a) ;
            System.out.println(x1);
            System.out.println(x2);
        }


    }
}
