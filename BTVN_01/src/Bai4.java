import java.util.Scanner;
import java.lang.Math;


public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double soduong,result;

        soduong=sc.nextDouble();
        result= Math.sqrt(soduong);

        System.out.format("%.3f", result);
    }
}
