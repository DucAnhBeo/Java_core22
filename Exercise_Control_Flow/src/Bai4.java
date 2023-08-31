import java.util.Scanner;

public class Bai4 {
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

        int n;
        n=sc.nextInt();

        for(int i=2;i<=n;i++)
        {
            if(SNT(i))
            {
                System.out.println(i);
            }
        }

    }
}
