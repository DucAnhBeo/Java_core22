import java.util.Scanner;
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        n=sc.nextInt();

        for(int i=2;i<n;i=i+2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int j=1;j<n;j=j+2)
        {
            System.out.print(j + " ");
        }
    }
}

