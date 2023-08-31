import java.util.Scanner;
public class Bai3 {
   /*public static int GCD(int a, int b )
    {
        if(b==0) return a;
        return GCD(b, a%b);
    }

    public static int LCM (int a, int b)
    {
        return a*b/GCD(a,b);
    }
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        int tmp;
        a = sc.nextInt();
        b = sc.nextInt();

        tmp=a;

        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("GCD la"+a);
        System.out.println("LCM la"+ tmp*b/a );


    }
}
