import java.util.Scanner;
public class DemoFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();

        int s=0,s1=0,s2=0;
        for(int i=0;i<=n;i++)
        {
            s+=i;
        }
        System.out.println(s);

        int i=2;
        while(i<=n)
        {
            s1=s1+i;
            i=i+2;
        }
        System.out.println(s1);

        do{
            s2+=i;
            i+=2;
        }while(i<=n);
        System.out.println(s2);
    }
}

