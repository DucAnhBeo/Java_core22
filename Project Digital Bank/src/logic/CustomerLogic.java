package logic;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

    private final List<Customer> customerList = new ArrayList<>();
    private final Customer customer = new Customer();
    public static final String CUSTOMER_DATA_FILE = "customer.dat";

    public CustomerLogic() {
    }

    public List<Customer> getCustomerList() {
        return customerList;
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
    }

    public void customerLogIn() {
    }
}
