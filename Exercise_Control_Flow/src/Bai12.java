import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        double c;
        c= sc.nextDouble();

        double pi=0.0;
        double tmp=1.0;
        int n=0;

        while(tmp>c)
        {
            tmp=1.0/(2*n+1);
            pi=pi+tmp;
            n++;
        }
        pi=pi*4;

        System.out.println(pi);
    }

}
