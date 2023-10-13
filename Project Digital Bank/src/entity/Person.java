package entity;

import java.util.Scanner;

public class Person implements InputTable, Displayable {

    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        System.out.println("Nhập tên khách hàng ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại");
        this.setPhone(new Scanner(System.in).nextLine());
    }

    @Override
    public void displayInfo() {

    }
}
