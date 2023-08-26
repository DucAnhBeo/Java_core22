import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int cd,cr,chuvi,dientich;

        cd=sc.nextInt();
        cr=sc.nextInt();

        chuvi=(cd+cr)*2;
        dientich=cd*cr;

        System.out.println(chuvi);
        System.out.println(dientich);
    }
}
