package logic;

import entity.Employee;
import entity.Factory;
import entity.EmployeeManagement;

import java.util.Scanner;


public class MenuManagement {

    private final EmployeeLogic employeeLogic = new EmployeeLogic();
    private final FactoryLogic factoryLogic = new FactoryLogic();
    private final EmployeeManagementLogic employeeManagementLogic = new EmployeeManagementLogic(employeeLogic,factoryLogic);


    public void menu() {
        while (true) {
            showMenu();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    employeeLogic.addNewEmployee();
                    break;
                case 2:
                    employeeLogic.showEmployees();
                    break;
                case 3:
                    factoryLogic.addNewFactory();
                    break;
                case 4:
                    factoryLogic.showFactory();
                    break;
                case 5:
                    employeeManagementLogic.inputChamCong();
                    break;
                case 6:
                    employeeManagementLogic.showChamCong();
                    break;
                case 7:
                    employeeManagementLogic.sortByEmployeeName();
                    break;
                case 8:
                    employeeManagementLogic.sortByFactoryNumber();
                    break;
                case 9:
                    employeeManagementLogic.Salary();
                    break;
                case 10:
                    return;
            }
        }
    }

    private int chooseFunction() {
        int choice = 0;
        System.out.print("Xin mời nhập lựa chọn: ");
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 10) {
                break;
            }
            System.out.print("Chức năng không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private void showMenu() {
        System.out.println("=============PHẦN MỀM QUẢN LÝ TRẢ LƯƠNG CHO CÔNG NHÂN============");
        System.out.println("1. Thêm danh sách công nhân .");
        System.out.println("2. Hiển thị danh sách công nhân.");
        System.out.println("3. Thêm danh sách kiểu xưởng sản xuất.");
        System.out.println("4. Hiển thị danh sách kiểu xưởng sản xuất.");
        System.out.println("5. Lập bảng tính công cho công nhân");
        System.out.println("6. Sắp xếp bảng tính công");
        System.out.println("7. Sắp xếp bảng tính công theo tên công nhân");
        System.out.println("8. Sắp xếp bảng tính công theo xưởng sản xuất");
        System.out.println("9. Tính thu nhập cho các phóng viên");
        System.out.println("10. Thoát");
    }
}
