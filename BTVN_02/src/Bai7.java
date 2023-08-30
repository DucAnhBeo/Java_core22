import java.util.Scanner;
import java.lang.Math;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float r;
        r=sc.nextFloat();

        double  chuvi, dientich;
        chuvi=2*r*Math.PI;
        dientich=r*r*Math.PI;

        chuvi= (double) Math.round(chuvi * 1000) /1000;
        dientich= (double) Math.round(dientich * 1000) /1000;

        System.out.println(chuvi);
        System.out.println(dientich);
    }
}
