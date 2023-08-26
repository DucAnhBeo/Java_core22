import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3,s4;
        int max;

        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();

        max=s1;

        if(max<s2) max=s2;
        if(max<s3) max=s3;
        if(max<s4) max=s4;

        System.out.println(max);
    }
}
