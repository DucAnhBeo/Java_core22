import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        n= sc.nextInt();
        int m=n;
        int s=0;

        while(m>0)
        {
            s=s*10+m%10;
            m=m/10;
        }
        if(s==n)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
