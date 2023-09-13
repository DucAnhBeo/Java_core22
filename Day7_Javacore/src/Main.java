import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //       Student sv1 = new Student(); //tao ra doi tuong sinh vien
        //       Student sv2 = new Student();

        //       Teacher gv1 = new Teacher(); //tao ra doi tuong sinh vien

        System.out.println("Nhap CCDD");
        String id = new Scanner(System.in).nextLine();

        Teacher gv2 = new Teacher(id);
        System.out.println(gv2.id);
    }
}
