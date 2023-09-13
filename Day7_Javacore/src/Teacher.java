import java.time.LocalDate;
import java.util.Scanner;

public class Teacher {

    public String id;
    public String fullName;
    public LocalDate birthday;
    public String address;
    public String specialization;


    public Teacher(){
    }



    public Teacher(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Teacher(String id, String fullName, LocalDate birthday, String address, String specialization) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
        this.specialization = specialization;
    }

    // constructor cua class Teacher
    public Teacher(String id) {
        //    System.out.println("Dang tao doi tuong");
        //   id="demo";

        //    System.out.println("Nhap CCDD");
        //    id = new Scanner(System.in).nextLine();

        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void chamBai(){
        System.out.println("dang cham");
    }
}




