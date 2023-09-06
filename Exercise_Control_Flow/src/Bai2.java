import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        n=sc.nextInt();

        int i=1;
        int dem=0;

            for( i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    dem++;
                    System.out.print(i);

                }
            }

        System.out.println();
        System.out.println(dem);
    }
}
