package entity;

import java.io.Serializable;
import java.util.Scanner;

public class Admin extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;

    private String username;
    private String password;

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
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public void inputInfo() {
        System.out.println("Nhập tên đăng nhập ");
        this.setUsername(new Scanner(System.in).nextLine());
        System.out.println("Nhập mật khẩu ");
        this.setPassword(new Scanner(System.in).nextLine());

        if(this.getUsername().equalsIgnoreCase("ducanhbeo") && this.getPassword().equals("123456789")) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.err.println("Đăng nhập thất bại");

            inputInfo();
        }

    }
}
