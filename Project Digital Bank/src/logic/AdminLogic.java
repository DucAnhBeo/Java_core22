package logic;

import entity.Admin;
import entity.Banker;
import entity.Customer;

import java.util.Scanner;


public class AdminLogic {

    private Admin admin = new Admin();
    private BankerLogic bankerLogic = new BankerLogic();
    private CustomerLogic customerLogic = new CustomerLogic();

    public Admin getAdmin() {
        return admin;
    }

    public void adminFunction() {
        admin.inputInfo();
        chooseAdminFunction();
    }

    private void chooseAdminFunction() {
        while(true) {
            showMenu();
            int choice = chooseFunction();

            switch (choice){
                case 1:
                    customerLogic.showCustomer();
                    break;
                case 2:
                    bankerLogic.showBanker();
                    break;
                case 3:
                    return;
            }

        }
    }

    private int chooseFunction() {
        int choice = 0;
        System.out.println("Xin mời nhập lựa chọn ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 3) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, xin mời nhập lại ");
        } while (true);

        return choice;
    }

    private void showMenu() {
        System.out.println("1. Xem danh sách khách hàng");
        System.out.println("2. Xem danh sách nhân viên ngân hàng");
        System.out.println("3. Thoát");
    }
}
