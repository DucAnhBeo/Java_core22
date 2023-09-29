package Logic;


import Entity.Service;
import Entity.Customer;

import java.util.Scanner;

public class MenuLogic {

    private final CustomerLogic customerLogic = new CustomerLogic();
    private final ServiceLogic serviceLogic = new ServiceLogic();
    private final BillManagementLogic billManagementLogic = new BillManagementLogic(customerLogic,serviceLogic);

    public void menu() {
        while (true) {
            printMenu();
            int functionChoose = chooseFunction();

            switch (functionChoose) {
                case 1:
                    customerLogic.inputCustomer();
                    break;
                case 2:
                    customerLogic.showCustomer();
                    break;
                case 3:
                    serviceLogic.inputService();
                    break;
                case 4:
                    serviceLogic.showService();
                    break;
                case 5:
                    billManagementLogic.inputBill();
                    break;
                case 6:
                    billManagementLogic.showBill();
                    break;
                case 7:
                    billManagementLogic.listByCustomerName();
                    break;
                case 8:
                    billManagementLogic.listByServiceNumber();
                    break;
                case 9:
                    billManagementLogic.customerPayment();
                    break;
                case 10:
                    return;

            }
        }
    }

    private  int chooseFunction() {
        int choice = 0;
        System.out.println("Xin mời nhập lựa chọn ");
        do {
            do {
                try {
                    choice = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            } while (true);
            if (choice >= 1 && choice <= 10) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, xin mời nhập lại ");
        } while (true);

        return choice;
    }

    private void printMenu() {
        System.out.println("--------------PHẦN MỀM QUẢN LÍ KHÁCH HÀNG---------------");
        System.out.println("1. Nhập thông tin khách hàng");
        System.out.println("2. In danh sách khách hàngđã có");
        System.out.println("3. Nhập thông tin dịch vụ");
        System.out.println("4. In danh sách dịch vụ đã có");
        System.out.println("5. Lập bảng hoá đơn ");
        System.out.println("6. In danh sach hoá đơn");
        System.out.println("7. Sắp xếp danh sách hoá đơn theo tên khách hàng");
        System.out.println("8. Sắp xếp danh sách hoá đơn theo số lượng sử dụng");
        System.out.println("9. Tính số tiền phải trả cho từng khách hàng");
        System.out.println("10. Thoát");

    }
}
