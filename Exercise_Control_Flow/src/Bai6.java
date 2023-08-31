import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n,m,sum=0;
        n=sc.nextInt();

        while(n>0)
        {
            m=n%10;
            n=n/10;
            sum+=m;
        }
        System.out.println(sum);
    }
}
