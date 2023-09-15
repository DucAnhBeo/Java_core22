package Bai2;

import java.util.Scanner;

public class inforSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien[] arrSV = enterSinhVien();
        outSinhVien(arrSV);

        System.out.println("------------------");
        System.out.println("Sap xep danh sach theo ten");

        outSV_name(arrSV);
        outSinhVien(arrSV);

        System.out.println("------------------");
        System.out.println("In danh sach theo lop");

        outSV_class(arrSV);
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

    public static void outSV_name(SinhVien[] arrSV) {
        for (int i = 0; i < arrSV.length - 1; i++) {
            for (int j = i + 1; j < arrSV.length; j++) {
                String str1 = arrSV[i].nameSV;
                String str2 = arrSV[j].nameSV;
                int result = str1.compareTo(str2);

                if (result > 0) {
                    SinhVien tmp = arrSV[i];
                    arrSV[i] = arrSV[j];
                    arrSV[j] = tmp;
                }
            }
        }
    }

    public static void outSV_class(SinhVien[] arrSV){
        for (int i = 0; i < arrSV.length - 1; i++) {
            for (int j = i + 1; j < arrSV.length; j++) {
                String str1 = arrSV[i].classSV;
                String str2 = arrSV[j].classSV;
                int result = str1.compareTo(str2);

                if (result == 0) {
                    SinhVien tmp = arrSV[i];
                    arrSV[i] = arrSV[j];
                    arrSV[j] = tmp;
                }
            }
        }
    }
}
