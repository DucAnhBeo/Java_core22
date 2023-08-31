import java.util.Scanner;
public class Bai16 {
    public static boolean SNT (int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n,m;
        n= sc.nextInt();
        m= sc.nextInt();

        if(SNT(n) && SNT(m))
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
