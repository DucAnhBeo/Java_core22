package logic;

import entity.Employee;

import java.util.Scanner;

public class EmployeeLogic {

    private Employee[] employees = new Employee[1000];
    private int totalEmployee;

    public Employee[] getEmployees() {
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
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void showEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public Employee searchById(int id) {
        Employee result = null;
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null && employees[j].getId() == id) {
                result = employees[j];
                break;
            }
        }
        return result;
    }
}
