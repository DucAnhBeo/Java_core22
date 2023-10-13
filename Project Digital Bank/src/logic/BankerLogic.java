package logic;

import entity.Banker;
import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankerLogic {

    private final List<Banker> bankerList = new ArrayList<>();
    private final Banker banker = new Banker();
    private final CustomerLogic customerLogic = new CustomerLogic();
    public static final String BANK_DATA_FILE = "bank.dat";

    public BankerLogic() {
    }

    public List<Banker> getBankerList() {
        return bankerList;
    }

    public void bankerFunction() {
        banker.inputInfo();
        chooseBankerFunction();
    }

    private void chooseBankerFunction() {
        while(true) {
            showMenu();
            int choice = chooseFunction();

            switch (choice){
                case 1:
                    customerLogic.showCustomer();
                    break;
                case 2:

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
        System.out.println("2. Thay đổi mật khẩu ");
        System.out.println("3. Thoát");
    }

    public void showBanker(){
        if(this.bankerList.isEmpty()){
            System.out.println("------------------------------------");
            System.out.println("Danh sách nhân viên ngân hàng rỗng");
            System.out.println("------------------------------------");
            return;
        }
        System.out.printf("%-50% | %-50% | \n", "Tên đăng nhập", "Mật khẩu");
        for (Banker banker : this.bankerList){
            banker.displayInfo();
        }
    }
}
