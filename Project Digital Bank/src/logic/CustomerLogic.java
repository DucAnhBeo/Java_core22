package logic;

import entity.Customer;
import utilities.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

    private List<Customer> customerList = new ArrayList<>() ;
    public static final String CUSTOMER_DATA_FILE = "customer.dat";

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = new ArrayList<>(customerList);
    }


    public void showCustomer(){
        if(this.customerList.isEmpty()){
            System.out.println("---------------------------");
            System.out.println("Danh sách khách hàng rỗng");
            System.out.println("----------------------------");
            return;
        }
        System.out.printf("%-33% | %-34% | %-33 |\n", "Tên khách hàng", "Địa chỉ", "Số điện thoai");
        for (Customer customer : this.customerList){
            customer.displayInfo();
        }
    }

    public void customerNewIn() {
        Customer customer = new Customer();
        customer.inputInfo();
        saveCustomer(customer);
    }

    public void saveCustomer(Customer customer) {
        this.customerList.add(customer);
        FileUtil.getInstance().writeDataToFile(this.customerList, CUSTOMER_DATA_FILE);
    }

    public void customerLogIn() {
        Customer newCustomer = new Customer();
        newCustomer.inputInfo();
        if(FileUtil.getInstance().readDataFromFile(CUSTOMER_DATA_FILE) == newCustomer.getUsername() && FileUtil.getInstance().readDataFromFile(CUSTOMER_DATA_FILE) == newCustomer.getPassword()){
            System.out.println("Mời chọn mục 2 và 3 ");
            return;
        }
        else {
            customerLogIn();
        }
    }

}
