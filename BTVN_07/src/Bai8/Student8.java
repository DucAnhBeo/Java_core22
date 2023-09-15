package Bai8;

import java.util.Scanner;

public class Student8 {
    enum Gender {
        NAM, NU, KHAC
    }

    public String idSV;
    public String nameSV;
    public String countrysideSV;
    public Gender sexSV;
    public String averagePointSV;
    public String yearSV;

    public Student8(){

    }

    public Student8(String idSV, String nameSV, String countrysideSV, Gender sexSV, String averagePointSV, String yearSV) {
        this.idSV = idSV;
        this.nameSV = nameSV;
        this.countrysideSV = countrysideSV;
        this.sexSV = sexSV;
        this.averagePointSV = averagePointSV;
        this.yearSV = yearSV;
    }

    @Override
    public String toString() {
        return "Student8{" +
                "idSV='" + idSV + '\'' +
                ", nameSV='" + nameSV + '\'' +
                ", countrysideSV='" + countrysideSV + '\'' +
                ", sexSV=" + sexSV +
                ", averagePointSV='" + averagePointSV + '\'' +
                ", yearSV='" + yearSV + '\'' +
                '}';
    }

    public void enterInf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien");
        idSV = sc.nextLine();

        System.out.println("Nhap ten sinh vien");
        nameSV = sc.nextLine();

        System.out.println("Nhap ten que quan sinh vien");
        countrysideSV = sc.nextLine();

        System.out.println("Nhap gioi tinh sinh vien");
        String genderStr = sc.nextLine();
        sexSV = Gender.valueOf(genderStr);

        System.out.println("Nhap diem trung binh sinh vien");
        averagePointSV = sc.nextLine();

        System.out.println("Nhap khoa sinh vien");
        yearSV = sc.nextLine();
    }
}
