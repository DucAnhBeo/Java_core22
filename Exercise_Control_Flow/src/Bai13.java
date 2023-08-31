import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        float sum=0;
        n= sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            sum+= (float) 1 /i;
        }
        System.out.println( sum);
    }
}
