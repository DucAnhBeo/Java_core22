package entity;

import java.util.Scanner;

public class BaiViet {

    private static int AUTO_ID = 100;
    private int id;
    private String nameBai;
    private String price;

    public BaiViet(){
        this.id= AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBai() {
        return nameBai;
    }

    public void setNameBai(String nameBai) {
        this.nameBai = nameBai;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BaiViet{" +
                "id=" + id +
                ", nameBai='" + nameBai + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void inputInfor() {
        System.out.println("Nhập ten bai viet");
        this.setNameBai(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ");
        this.setPrice(new Scanner(System.in).nextLine());

    }
}
