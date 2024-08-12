package logic;

import entity.Banker;
import utilities.FileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankerLogic  {

    private List<Banker> bankerList = new ArrayList<>() ;
    public static final String BANK_DATA_FILE = "bank.dat";

    public List<Banker> getBankerList() {
        return bankerList;
    }

    public void setBankerList(List<Banker> bankerList) {
        this.bankerList = new ArrayList<>(bankerList);
    }

    private void chooseBankerFunction() {
        while (true) {
            showMenu();
            int choice = chooseFunction();

            switch (choice) {
                case 1:
                    CustomerLogic customerLogic = new CustomerLogic();
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

    public void showBanker() {
        if (this.bankerList.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Danh sách nhân viên ngân hàng rỗng");
            System.out.println("------------------------------------");
            return;
        }
        System.out.printf("%-50% | %-50% | \n", "Tên đăng nhập", "Mật khẩu");
        for (Banker banker : this.bankerList) {
            banker.displayInfo();
        }
    }

    public void bankerNewIn() {
        Banker banker = new Banker();
        banker.inputInfo();
        saveBanker(banker);
    }

    public void saveBanker(Banker banker) {
        this.bankerList.add(banker);
        FileUtil.getInstance().writeDataToFile(this.bankerList, BANK_DATA_FILE);
    }

    public void bankerLogIn() {
        Banker newBanker = new Banker();
        newBanker.inputInfo();
        if(FileUtil.getInstance().readDataFromFile(BANK_DATA_FILE) == newBanker.getUsername() && FileUtil.getInstance().readDataFromFile( BANK_DATA_FILE) == newBanker.getPassword()){
            chooseBankerFunction();
        }
        else {
            bankerLogIn();
        }
    }
}
