package entity;

import java.io.Serializable;
import java.util.Scanner;

public class Customer extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;


    private long STK;
    private String username;
    private String password;

    public long getSTK() {
        return STK;
    }

    public void setSTK(long STK) {
        this.STK = STK;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "STK=" + STK +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhập số tài khoản ");
        this.setSTK(new Scanner(System.in).nextInt());
        System.out.println("Nhập tên đăng nhập ");
        this.setUsername(new Scanner(System.in).nextLine());
        System.out.println("Nhập mật khẩu ");
        this.setPassword(new Scanner(System.in).nextLine());
    }

    @Override
    public void displayInfo(){
        System.out.printf("%-33% | %-34% | %-33 |\n", this.getName(), this.getAddress(), this.getPhone());
    }
}
