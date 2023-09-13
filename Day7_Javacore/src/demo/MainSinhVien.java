package demo;

import java.util.Random;
import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args) {
        SinhVien[] mangSv = nhapSinhVien();
        inSinhVien(mangSv);
        doiThongTin(mangSv);
    }

    public static SinhVien[] nhapSinhVien() {
        System.out.println("Nhap so sinh vien muon them moi");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] mangSv = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien");
            mangSv[i] = new SinhVien();
            mangSv[i].nhapThongTin();
        }
        return mangSv;
    }

    public static void inSinhVien(SinhVien[] mangSv) {
        System.out.println("____________");
        for (int i = 0; i < mangSv.length; i++) {
            System.out.println(mangSv[i]);
        }
    }

    public static void doiThongTin(SinhVien[] mangSv) {
        int x = new Random().nextInt(10);
        mangSv[x].nhapThongTin();
    }
}

