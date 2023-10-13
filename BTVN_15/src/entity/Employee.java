package entity;

import java.util.Scanner;

public class Employee extends Person {

    private int id;
    private static int AUTO_ID = 1000;
    private int level;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhập bậc thợ từ 1 đến 7");
        this.level = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            level = new Scanner(System.in).nextInt();
            if (level >= 1 && level <= 7) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
    }
}
