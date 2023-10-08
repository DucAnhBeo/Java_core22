package entity;

import java.util.Arrays;

public class EmployeeManagement {

    private Employee employee;
    private EmployeeManagementDetail[] employeeManagementDetails;
    private int totalWorkDay;

    public EmployeeManagement(Employee employee, EmployeeManagementDetail[] employeeManagementDetails) {
        this.employee = employee;
        this.employeeManagementDetails = employeeManagementDetails;

        int tempTotal = 0;
        for (int i = 0; i < employeeManagementDetails.length; i++) {
            tempTotal += employeeManagementDetails[i].getWorkday();
        }
        this.totalWorkDay = tempTotal;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeManagementDetail[] getEmployeeManagementDetails() {
        return employeeManagementDetails;
    }

    public void setEmployeeManagementDetails(EmployeeManagementDetail[] employeeManagementDetails) {
        this.employeeManagementDetails = employeeManagementDetails;
    }

    public int getTotalWorkDay() {
        return totalWorkDay;
    }

    public void setTotalWorkDay(int totalWorkDay) {
        this.totalWorkDay = totalWorkDay;
    }

    @Override
    public String toString() {
        return "EmployeeManagement{" +
                "employee=" + employee +
                ", employeeManagementDetails=" + Arrays.toString(employeeManagementDetails) +
                ", totalWorkDay=" + totalWorkDay +
                '}';
    }
}
