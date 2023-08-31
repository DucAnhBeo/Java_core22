import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n1,sum1=0;
        n1=sc.nextInt();

        for(int i=0;i<=n1;i++)
        {
            sum1+=i;
        }
        System.out.println(sum1);

        System.out.println("-----------------------------");

        int n2,sum2=0;
        n2= sc.nextInt();

        for (int j=1;j<=n2;j=j+2)
        {
            sum2+=j;
        }
        System.out.println(sum2);

        System.out.println("-----------------------------");

        int n3,sum3=0;
        n3= sc.nextInt();

        for(int k=0;k<=n3;k=k+2)
        {
            sum3+=k;
        }
        System.out.println(sum3);
    }
}
