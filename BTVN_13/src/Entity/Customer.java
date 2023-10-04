package Entity;

import Statics.CustomerType;

import java.util.Scanner;

public class Customer extends Person   {

    private static int AUTO_ID = 10000;
    private int id;
    private CustomerType customerType;

    public Customer() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerType=" + customerType +
                '}';
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.println("Xin chọn nhóm khách hàng");
        System.out.println("1. Cá nhân");
        System.out.println("2. đại diện đơn vị hành chính");
        System.out.println("3. đại diện đơn vị kinh doanh");

        int temp = 0;
        System.out.println("Hãy nhập lựa chọn của bạn");
        do {
            do {
                try {
                    temp = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            }while (true);
            if (temp >= 1 && temp <= 3) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, xin mời nhập lại");
        } while (true);

        switch (temp) {
            case 1:
                this.customerType = CustomerType.CÁ_NHÂN;
                break;
            case 2:
                this.customerType = CustomerType.ĐẠI_DIỆN_ĐƠN_VỊ_HÀNH_CHÍNH;
                break;
            case 3:
                this.customerType = CustomerType.ĐẠI_DIỆN_ĐƠN_VỊ_KINH_DOANH;
                break;

        }
    }

}

