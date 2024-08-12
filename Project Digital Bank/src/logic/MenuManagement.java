package logic;

import java.util.Scanner;

public class MenuManagement {

    private final AdminLogic adminLogic = new AdminLogic();
    private final BankerLogic bankerLogic = new BankerLogic();
    private final CustomerLogic customerLogic = new CustomerLogic();

    public void menu() {
        while (true) {
            printMenu();
            int functionChoose = chooseFunction();

            switch (functionChoose) {
                case 1:
                    showSelectionUser();
                    break;
                case 2:
                    showSelectionTransferMoney();
                    break;
                case 3:
                    showMainFunction();
                    return;
            }
        }

    }

    private void showMainFunction() {
        System.out.println(" Bạn muốn chọn ");
        System.out.println("1. Sao kê tài khoản");
        System.out.println("2. Tài khoản tiết kiệm ");
        System.out.println("3. Vay vốn ");
        System.out.println("4. Đổi ngoại tệ ");

        int choice = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return;
        }
    }

    private void showSelectionTransferMoney() {
        System.out.println(" Bạn muốn chọn ");
        System.out.println("1. Chuyển tiền");
        System.out.println("2. Rút tiền ");

        int choice = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice == 1 || choice == 2) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);

        switch (choice) {
            case 1:
                break;
            case 2:
                return;
        }
    }

    private void showSelectionUser() {
        System.out.println(" Bạn muốn đăng ký, đăng nhập tài khoản nào ");
        System.out.println("1. Khách hàng");
        System.out.println("2. Nhân viên ngân hàng");
        System.out.println("3. Quản trị viên");

        int choice = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice == 1 || choice == 2 || choice == 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);

        switch (choice) {
            case 1:
                System.out.println("Mời bạn tạo tài khoản mới hoặc đăng nhập vào tài khoản sẵn có ");
                System.out.println("1. Đăng ký");
                System.out.println("2. Đăng nhập");
                System.out.println("3. Thoát");
                int temp = 0;
                System.out.print("Xin mời nhập lựa chọn: ");
                do {
                    temp = new Scanner(System.in).nextInt();
                    if (temp == 1 || temp == 2 || temp == 3) {
                        break;
                    }
                    System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
                } while (true);

                switch (temp) {
                    case 1:
                        customerLogic.customerNewIn();
                        break;
                    case 2:
                        customerLogic.customerLogIn();
                        break;
                    case 3:
                        return;

                }
                break;
            case 2:
                System.out.println("Mời bạn tạo tài khoản mới hoặc đăng nhập vào tài khoản sẵn có ");
                System.out.println("1. Đăng ký");
                System.out.println("2. Đăng nhập");
                System.out.println("3. Thoát");
                int tmp = 0;
                System.out.print("Xin mời nhập lựa chọn: ");
                do {
                    tmp = new Scanner(System.in).nextInt();
                    if (tmp >= 1 && tmp <= 3) {
                        break;
                    }
                    System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
                } while (true);

                switch (tmp) {
                    case 1:
                        bankerLogic.bankerNewIn();
                        break;
                    case 2:
                        bankerLogic.bankerLogIn();
                        break;
                    case 3:
                        return;

                }
                break;
            case 3:
                adminLogic.adminFunction();
                return;

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

    private void printMenu() {
        System.out.println("--------------PHẦN MỀM QUẢN LÍ NGÂN HÀNG SỐ---------------");
        System.out.println("1. Mời bạn đăng ký, đăng nhập cho tài khoản sử dụng");
        System.out.println("2. Mời bạn sử dụng chức năng chuyển tiền ");
        System.out.println("3. Mời bạn chọn 1 trong các chức năng chính dưới đây ");
        System.out.println("4. Thoát ");

    }
}
