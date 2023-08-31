import java.util.Scanner;
public class DemoSNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();

        if(n<2) System.out.println("False");
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                System.out.println("False");
        }
        System.out.println("True");

    }
}
