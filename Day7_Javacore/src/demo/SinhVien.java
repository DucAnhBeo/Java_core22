package demo;

import java.util.Scanner;

public class SinhVien {

    public int id;
    public String hoVaTen;
    public String diaChi;
    public String gioiTinh;
    public float diemTrungBinh;
    public String tenKhoa;

    public SinhVien(){

    }

    public SinhVien(int id, String hoVaTen, String diaChi, String gioiTinh, float diemTrungBinh, String tenKhoa) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tenKhoa='" + tenKhoa + '\'' +
                '}';
    }

    public void nhapThongTin() {
        System.out.println("Ma sinh vien");
        id = new Scanner(System.in).nextInt();

        System.out.println("Nhap ho va ten");
        hoVaTen = new Scanner(System.in).nextLine();

        System.out.println("Nhap dia chi");
        diaChi = new Scanner(System.in).nextLine();

        System.out.println("Nhap gioi tinh sinh vien");
        gioiTinh = new Scanner(System.in).nextLine();

        System.out.println("Nhap diem trung binh sinh vien");
        diemTrungBinh = new Scanner(System.in).nextFloat();

        System.out.println("Nhap ten khoa sinh vien");
        tenKhoa = new Scanner(System.in).nextLine();
    }
}
