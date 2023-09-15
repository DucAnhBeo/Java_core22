package Bai8;



import java.util.Scanner;

public class MainStu8 {
    public static void main(String[] args) {
        Student8[] arrSV =enterSinhVien();
        outSinhVien(arrSV);
    }

    public static Student8[] enterSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        int n = sc.nextInt();
        Student8[] arrSV = new Student8[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + i);
            arrSV[i] = new Student8();
            arrSV[i].enterInf();
        }
        return arrSV;
    }

    public static void outSinhVien(Student8[] arrSV) {
        for (int i = 0; i < arrSV.length; i++) {
            System.out.println(arrSV[i]);
        }
    }
}
