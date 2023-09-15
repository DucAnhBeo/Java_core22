package Bai2;

import java.util.Scanner;

public class SinhVien {

    public String idSV;
    public String nameSV;
    public String classSV;
    public String yearSV;


    public SinhVien() {

    }

    public SinhVien(String idSV, String nameSV, String classSV, String yearSV) {
        this.idSV = idSV;
        this.nameSV = nameSV;
        this.classSV = classSV;
        this.yearSV = yearSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "idSV='" + idSV + '\'' +
                ", nameSV='" + nameSV + '\'' +
                ", classSV='" + classSV + '\'' +
                ", yearSV='" + yearSV + '\'' +
                '}';
    }

    public void enterInf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien");
        idSV = sc.nextLine();

        System.out.println("Nhap ten sinh vien");
        nameSV = sc.nextLine();

        System.out.println("Nhap lop sinh vien");
        classSV = sc.nextLine();

        System.out.println("Nhap khoa sinh vien");
        yearSV = sc.nextLine();
    }

}
