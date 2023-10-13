package logic;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeLogic {

    //    private final Employee[] employees = new Employee[1000];
    private final List<Employee> employees = new ArrayList<>();
    private int totalEmployee;

    public List<Employee> getEmployees() {
        return employees;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void addNewEmployee() {
        System.out.print("Nhập số lượng công nhân muốn thêm mới: ");
        int employeeNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < employeeNum; i++) {
            System.out.println("Nhập thông tin cho công nhân thứ " + (i + 1));
            Employee employee = new Employee();
            employee.inputInfo();
            saveEmployee(employee);
            System.out.println("----------------------");
        }
        totalEmployee += employeeNum;
    }

    private void saveEmployee(Employee employee) {
        if(employee == null) {
            return;
        }
        employees.add(employee);
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] == null) {
//                employees[i] = employee;
//                break;
//            }
//        }
    }

    public void showEmployees() {
        System.out.println(employees);
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                System.out.println(employees[i]);
//            }
//        }
    }

    public boolean isEmptyEmployee() {
        return employees.isEmpty();
    }


    public Employee searchById(int id) {
        Employee result = null;
        for (int j = 0; j < employees.size(); j++) {
            if (employees.get(j).getId() == id) {
                return employees.get(j);
            }
//            if (employees[j] != null && employees[j].getId() == id) {
//                result = employees[j];
//                break;
//            }
        }
        return null;
    }
}
