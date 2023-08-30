import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        double nghiem;
        if(a<0)
            System.out.println("false");
        else {
            nghiem= (double) -b /a;
            System.out.println(nghiem);
        }


    }
}
