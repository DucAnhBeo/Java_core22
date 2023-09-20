package entity;

import statics.ReporterType;
import entity.Person;

import java.util.Scanner;

public class Reporter extends Person {

    private static int AUTO_ID = 10000;
    private int id;
    private ReporterType reporterType;

    public Reporter() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReporterType getReporterType() {
        return reporterType;
    }

    public void setReporterType(ReporterType reporterType) {
        this.reporterType = reporterType;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", reporterType=" + reporterType +
                '}';
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.println("Nhập loại phong vien, chọn 1 trong các loại dưới đây");
        System.out.println("1. Chuyen nghiep");
        System.out.println("2. Nghiep du");
        System.out.println("3. Cong tac vien");
        int type = new Scanner(System.in).nextInt();

        switch (type) {
            case 1:
                this.setReporterType(ReporterType.CHUYENNGHIEP);
                break;
            case 2:
                this.setReporterType(ReporterType.NGHIEPDU);
                break;
            case 3:
                this.setReporterType(ReporterType.CONGTACVIEN);
                break;
        }
    }

}



