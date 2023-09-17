package Bai6;


import java.util.Random;
import java.util.Scanner;

public class inforSinhVien {
    public static void main(String[] args) {
        SinhVien[] arrSV = enterSinhVien();
        outSinhVien(arrSV);

        System.out.println("----------------");
        changeInfSinhVien(arrSV);
        outSinhVien(arrSV);

        System.out.println("-------------------");
        eraserInfSinhVien(arrSV);
        outSinhVien(arrSV);
    }

    public static SinhVien[] enterSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        int n = sc.nextInt();
        SinhVien[] arrSV = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + i);
            arrSV[i] = new SinhVien();
            arrSV[i].enterInf();
        }
        return arrSV;
    }

    public static void outSinhVien(SinhVien[] arrSV) {
        for (int i = 0; i < arrSV.length; i++) {
            System.out.println(arrSV[i]);
        }
    }

    public static void changeInfSinhVien(SinhVien[] arrSV) {
        int ran = new Random().nextInt(arrSV.length);
        arrSV[ran].enterInf();
    }

    public static void eraserInfSinhVien(SinhVien[] arrSV) {
        int ran = new Random().nextInt(arrSV.length);
        arrSV[ran - 1] = null;
    }


}
