package Entity;

import java.util.Arrays;

public class BillManagement {

    private Customer customer;
    BillManagementDetail[] details;

    public BillManagement(Customer customer, BillManagementDetail[] details) {
        this.customer = customer;
        this.details = details;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(BillManagementDetail[] details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "BillManagement{" +
                "customer=" + customer +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
