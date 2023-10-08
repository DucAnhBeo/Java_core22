package logic;

import entity.Employee;
import entity.EmployeeManagement;
import entity.EmployeeManagementDetail;
import entity.Factory;

import java.util.Scanner;

public class EmployeeManagementLogic {

    private EmployeeLogic employeeLogic;
    private FactoryLogic factoryLogic;
    private EmployeeManagement[] employeeManagements = new EmployeeManagement[1000];

    public EmployeeManagementLogic(EmployeeLogic employeeLogic, FactoryLogic factoryLogic) {
        this.employeeLogic = employeeLogic;
        this.factoryLogic = factoryLogic;
        this.employeeManagements = employeeManagements;
    }

    public void inputChamCong() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin công nhân hoặc xưởng, vui lòng nhập danh sách công nhân hoặc xưởng trước");
            return;
        }

        System.out.print("Bạn muốn lập bảng tính công cho bao nhiêu công nhân: ");
        int employeeNum;
        do {
            employeeNum = new Scanner(System.in).nextInt();
            if (employeeNum > 0 && employeeNum <= employeeLogic.getTotalEmployee()) {
                break;
            }
            System.out.println("Số lượng công nhân cần phải là số dương và nhỏ hơn số lượng công nhân được khai báo");
        } while (true);

        for (int i = 0; i < employeeNum; i++) {
            System.out.print("Công nhân " + (i + 1) + " muốn lập bảng tính công là công nhân nào, nhập ID công nhân: ");
            Employee employee = inputEmployee();

            EmployeeManagementDetail[] details = inputEmployeeManagement();

            EmployeeManagement employeeManagement = new EmployeeManagement(employee, details);
            saveEmployeeManagement(employeeManagement);
        }
    }

    private Employee inputEmployee() {
        int employeeId;
        Employee employee = null;

        do {
            employeeId = new Scanner(System.in).nextInt();
            employee = employeeLogic.searchById(employeeId);
            if (employee != null) {
                break;
            }
            System.out.print("Không tìm thấy công nhân có mã " + employeeId + ", vui lòng nhập lại: ");
        } while (true);
        return employee;
    }

    private EmployeeManagementDetail[] inputEmployeeManagement() {
        System.out.println("Nhập số xưởng sản xuất mà công nhân tham gia");
        int factoryNum;
        do {
            try {
                factoryNum = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
            }
        } while (true);

        EmployeeManagementDetail[] details = new EmployeeManagementDetail[factoryNum];
        int count = 0;
        for (int j = 0; j < factoryNum; j++) {
            System.out.println("Nhập thông tin cho xưởng sản xuất");
            System.out.println("Nhập ID của xưởng sản xất");

            int factoryId;
            Factory factory = null;
            do {
                do {
                    try {
                        factoryId = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                    }
                } while (true);

                factory = factoryLogic.searchById(factoryId);
                if (factory != null) {
                    break;
                }
                System.out.println("Không có thông tin xưởng" + factoryId + "vui lòng nhập lại");
            } while (true);

            System.out.println("Công nhân làm " + factory.getName() + "số ngày là bao nhiêu");

            int workday;
            do {
                try {
                    workday = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            EmployeeManagementDetail detail = new EmployeeManagementDetail(factory, workday);
            details[count] = detail;
            count++;
        }
        return details;
    }

    private void saveEmployeeManagement(EmployeeManagement employeeManagement) {
        for (int i = 0; i < employeeManagements.length; i++) {
            if (employeeManagements[i] == null) {
                employeeManagements[i] = employeeManagement;
                break;
            }
        }
    }

    public void showChamCong() {
        for (int i = 0; i < employeeManagements.length; i++) {
            if (employeeManagements[i] != null) {
                System.out.println(employeeManagements[i]);
            }
        }
    }

    public void sortByEmployeeName() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin công nhân hoặc xưởng sản xuất, vui lòng nhập danh sách công nhân và xưởng sản xuất trước");
            return;
        }
        for (int i = 0; i < employeeManagements.length - 1; i++) {
            if (employeeManagements[i] == null) {
                continue;
            }
            for (int j = i + 1; j < employeeManagements.length; j++) {
                if (employeeManagements[j] == null) {
                    continue;
                }
                if (employeeManagements[i].getEmployee().getName().trim().compareToIgnoreCase(employeeManagements[j].getEmployee().getName().trim()) > 0) {
                    EmployeeManagement temp = employeeManagements[i];
                    employeeManagements[i] = employeeManagements[j];
                    employeeManagements[j] = temp;
                }
            }
        }
        showChamCong();
    }

    public void sortByFactoryNumber() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin công nhân hoặc xưởng sản xuất, vui lòng nhập danh sách công nhân và xưởng sản xuất trướcc");
            return;
        }
        for (int i = 0; i < employeeManagements.length - 1; i++) {
            if (employeeManagements[i] == null) {
                continue;
            }
            EmployeeManagement temp = employeeManagements[i];
            employeeManagements[i] = employeeManagements[i + 1];
            employeeManagements[i + 1] = temp;
        }
        showChamCong();
    }

    public void Salary() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin công nhân hoặc xưởng sản xuất, vui lòng nhập danh sách công nhân và xưởng sản xuất trước");
            return;
        }
        for (EmployeeManagement employeeManagement : employeeManagements) {
            if (employeeManagement == null) {

                continue;
            }
            double payment = 0;
            EmployeeManagementDetail[] list1 = employeeManagement.getEmployeeManagementDetails();
            for (int j = 0; j < list1.length; j++) {
                payment += list1[j].getFactory().getCoefficient()*450000* list1[j].getEmployee().getLevel()*((double) list1[j].getWorkday() /22);
            }
            System.out.println("Tổng lương công nhân  " + employeeManagement.getEmployee().getName() + " là " + payment);
        }
    }

    private boolean checkData() {
        boolean employeeData = false;
        for (int i = 0; i < employeeLogic.getEmployees().length; i++) {
            if (employeeLogic.getEmployees()[i] != null) {
                employeeData = true;
                break;
            }
        }

        boolean factoryData = false;
        for (int i = 0; i < factoryLogic.getFactories().length; i++) {
            if (factoryLogic.getFactories()[i] != null) {
                factoryData = true;
                break;
            }
        }

        return employeeData && factoryData;
    }
}
