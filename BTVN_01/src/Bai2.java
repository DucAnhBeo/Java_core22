import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r, chuvi, dientich;
        r=sc.nextDouble();

        chuvi=2*r*3.14;
        dientich=r*r*3.14;

        System.out.println(chuvi);
        System.out.println(dientich);
    }
}
