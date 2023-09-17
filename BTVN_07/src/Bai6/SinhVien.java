package Bai6;

import java.util.Scanner;

public class SinhVien {
    public String idSV;
    public String nameSV;
    public String countrysideSV;
    public String sexSV;
    public String averagePointSV;
    public String yearSV;


    public SinhVien() {

    }

    public SinhVien(String idSV, String nameSV, String countrysideSV, String sexSV, String averagePointSV, String yearSV) {
        this.idSV = idSV;
        this.nameSV = nameSV;
        this.countrysideSV = countrysideSV;
        this.sexSV = sexSV;
        this.averagePointSV = averagePointSV;
        this.yearSV = yearSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "idSV='" + idSV + '\'' +
                ", nameSV='" + nameSV + '\'' +
                ", countrysideSV='" + countrysideSV + '\'' +
                ", sexSV='" + sexSV + '\'' +
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
        sexSV = sc.nextLine();

        System.out.println("Nhap diem trung binh sinh vien");
        averagePointSV = sc.nextLine();

        System.out.println("Nhap khoa sinh vien");
        yearSV = sc.nextLine();
    }
}
