import java.util.Scanner;
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        n= sc.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++)
        {
            if(i%7==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);

    }

}
