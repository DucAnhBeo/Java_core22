package Entity;

import java.util.Scanner;

public class Service implements InputTable {

    private static int AUTO_ID = 100;
    private int id;
    private String nameService;
    private double price;
    private String unit;

    public Service() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.println("Nhập tên dịch vụ");
        this.setNameService(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá bán");
        this.setPrice(new Scanner(System.in).nextDouble());
        System.out.println("Nhập đơn vị tính");
        this.setUnit(new Scanner(System.in).nextLine());

    }
}
