import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);

        String birth =sc.nextLine();

        int yearBirth = Integer.parseInt(birth.substring(4,8));

        int yearNow;
        LocalDate dateNow= LocalDate.now();
        yearNow= dateNow.getYear();

        int age;
        age=yearNow-yearBirth;
        System.out.println(yearNow);
        System.out.println(yearBirth);
        System.out.println(age);







    }
}
