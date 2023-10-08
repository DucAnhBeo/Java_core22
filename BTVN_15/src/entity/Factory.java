package entity;

import java.util.Scanner;

public class Factory implements Inputable{

    private int id;
    private static int AUTO_ID = 100;
    private String name;
    private String describe;
    private int coefficient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập mô tả về xưởng sản xuất: ");
        this.describe = new Scanner(System.in).nextLine();
        System.out.print("Nhập hệ số công viên, đánh giá chung về công việc từ 1 đến 20: ");
        this.coefficient = 0;
        do {
            coefficient = new Scanner(System.in).nextInt();
            if (coefficient >= 1 && coefficient <= 20) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
    }
}
