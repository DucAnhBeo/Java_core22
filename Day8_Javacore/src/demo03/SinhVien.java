package demo03;

public class SinhVien {

    private String ma;
    private String ten;
    private float diemTrungBinh;
    private int tuoi;

    public SinhVien() {

    }

    public SinhVien(String ma, String ten, float diemTrungBinh, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.diemTrungBinh = diemTrungBinh;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma='" + ma + '\'' +
                ", name='" + ten + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                ", tuoi=" + tuoi +
                '}';
    }

    //setter -ham set
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(String cccd) {
        ma = cccd;
    }

    public void setTuoi(int age) {
        if (age < 0) {
            System.out.println("sai");
            return;
        }
        tuoi = age;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    //reflection
}
