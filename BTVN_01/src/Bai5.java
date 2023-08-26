import java.util.Scanner;
import java.lang.Math;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1,s2,result;

        s1=sc.nextDouble();
        s2=sc.nextDouble();

        result=s1/s2;

        System.out.format("%.3f", result);
    }
}
