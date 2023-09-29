package Logic;

import Entity.Customer;

import java.util.Scanner;

public class CustomerLogic {

    private Customer[] customers = new Customer[100];

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void inputCustomer() {
        System.out.println("Nhập số khách hàng ");
        int customerNumber ;
        do {
            try {
                customerNumber = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("Nhập khách hàng thứ " + (i + 1));
            Customer customer = new Customer();
            customer.inputInfor();
            saveCustomer(customer);
        }
    }

    private void saveCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }

    public void showCustomer() {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(customers[i]);
            }
        }
    }

    public Customer searchRCustomerId(int customerId) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getId() == customerId) {
                return customers[i];
            }
        }
        return null;
    }
}
