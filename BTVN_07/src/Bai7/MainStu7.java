package Bai7;


import java.util.Arrays;
import java.util.Scanner;

public class MainStu7 {

    public static void main(String[] args) {
        Student7[] arrSV = enterSinhVien();
        outSinhVien(arrSV);

    }

    public static Student7[] enterSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien");
        int n = sc.nextInt();
        Student7[] arrSV = new Student7[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + i);
            arrSV[i] = new Student7();
            arrSV[i].enterInf();
        }
        return arrSV;
    }

    public static void outSinhVien(Student7[] arrSV) {

        // copy
        Arrays.sort(arrSV, (a, b) -> b.id - a.id);

        for (int i = 0; i < arrSV.length; i++) {
            System.out.println(arrSV[i]);
        }
    }
}
