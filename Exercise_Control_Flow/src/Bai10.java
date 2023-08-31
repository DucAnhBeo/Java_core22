import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int h;
        h= sc.nextInt();

        for(int i=0;i<h;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if(i==h-1 || j==0 || j==i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
