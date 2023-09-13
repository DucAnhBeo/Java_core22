import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Nhap chieu dai");
        float CD= new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu rong");
        float CR= new Scanner(System.in).nextFloat();

        HinhChuNhat hcn= new HinhChuNhat(CD,CR);

        System.out.println("Chu vi la"+ hcn.chuVi());
        System.out.println("Chu vi la"+ hcn.dienTich());
    }
}
