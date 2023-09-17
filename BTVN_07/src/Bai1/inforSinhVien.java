package Bai1;

import java.util.Scanner;

public class inforSinhVien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        SinhVien infSV = new SinhVien();
        infSV.enterInf();
        System.out.println(infSV);
    }
}
