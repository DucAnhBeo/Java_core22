package Logic;

import Entity.BillManagement;
import Entity.BillManagementDetail;
import Entity.Customer;
import Entity.Service;

import java.util.Scanner;

public class BillManagementLogic {

    private CustomerLogic customerLogic;
    private ServiceLogic serviceLogic;
    private BillManagement[] billManagements = new BillManagement[100];

    public BillManagementLogic(CustomerLogic customerLogic, ServiceLogic serviceLogic) {
        this.customerLogic = customerLogic;
        this.serviceLogic = serviceLogic;
    }

    public void inputBill() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin khách hàng hoặc dịch vụ, vui lòng nhập khách hàng hoặc dịch vụ trước");
            return;
        }
        System.out.println("Nhập số lượng khách hàng trong danh sách");
        int customerNumber;
        do {
            try {
                customerNumber = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));

            Customer customer = inputBillCustomer();

            BillManagementDetail[] details = inputBillManagementDetail();

            BillManagement billManagement = new BillManagement(customer, details);

            saveBillManagement(billManagement);

        }
    }

    private void saveBillManagement(BillManagement billManagement) {
        for (int j = 0; j < billManagements.length; j++) {
            if (billManagements[j] == null) {
                billManagements[j] = billManagement;
                break;
            }
        }
    }

    private BillManagementDetail[] inputBillManagementDetail() {
        System.out.println("Nhập số dịch vụ mà khách hàng dùng");
        int serviceNumber;
        do {
            do {
                try {
                    serviceNumber = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            } while (true);
            if (serviceNumber > 0 && serviceNumber < 6) {
                break;
            }
            System.out.println("Số lượng mặt hàng lớn hơn 5, vui long nhập lại");
        } while (true);

        BillManagementDetail[] details = new BillManagementDetail[serviceNumber];
        int count = 0;
        for (int j = 0; j < serviceNumber; j++) {
            System.out.println("Nhập thông tin cho dịch vụ");
            System.out.println("Nhập ID của dịch vụ");

            int serviceId;
            Service service = null;
            do {
                do {
                    try {
                        serviceId = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                    }
                } while (true);

                service = serviceLogic.searchServiceById(serviceId);
                if (service != null) {
                    break;
                }
                System.out.println("Không có thông tin dịch vụ " + serviceId + "vui lòng nhập lại");
            } while (true);

            System.out.println("Nhân viên bán " + service.getNameService() + "số lượng là bao nhiêu");

            int quantity ;
            do {
                try {
                    quantity = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            BillManagementDetail detail = new BillManagementDetail(service, quantity);
            details[count] = detail;
            count++;
        }
        return details;
    }

    private Customer inputBillCustomer() {
        System.out.println("Nhâp mã khách hàng");
        Customer customer = null;
        int customerId;
        do {
            do {
                try {
                    customerId = new Scanner(System.in).nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
                }
            } while (true);

            customer = customerLogic.searchRCustomerId(customerId);
            if (customer != null) {
                break;
            }
            System.out.println("Không tồn tại nhân viên" + customer.getId() + "vui long nhập lại");
        } while (true);
        return customer;
    }

    public void showBill() {
        for (int i = 0; i < billManagements.length; i++) {
            if (billManagements[i] != null) {
                System.out.println(billManagements[i]);
            }
        }
    }

    public void listByCustomerName() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin khách hàng hoặc dịch vụ, vui lòng nhập danh sách khách hàng hoặc dịch vụ trước");
            return;
        }
        for (int i = 0; i < billManagements.length - 1; i++) {
            if (billManagements[i] == null) {
                continue;
            }
            for (int j = i + 1; j < billManagements.length; j++) {
                if (billManagements[j] == null) {
                    continue;
                }
                BillManagement temp = billManagements[i];
                billManagements[i] = billManagements[j];
                billManagements[j] = temp;
            }
        }
        showBill();
    }

    public void listByServiceNumber() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin khách hàng hoặc dịch vụ, vui lòng nhập danh sách khách hàng hoặc dịch vụ trước");
            return;
        }
        for (int i = 0; i < billManagements.length - 1; i++) {
            if (billManagements[i] == null) {
                continue;
            }
            for (int j = i + 1; j < billManagements.length; j++) {
                if (billManagements[j] == null) {
                    continue;
                }

                BillManagement temp = billManagements[i];
                billManagements[i] = billManagements[j];
                billManagements[j] = temp;

            }
        }
        showBill();
    }

    public void customerPayment() {
        if (!checkData()) {
            System.out.println("Chưa có thông tin khách hàng hoặc dịch vụ, vui lòng nhập danh sách khách hàng hoặc dịch vụ trước");
            return;
        }
        for (BillManagement billManagement : billManagements) {
            if (billManagement == null) {

                break;
            }
            double payment = 0;
            BillManagementDetail[] list = billManagement.getDetails();
            for (int j = 0; j < list.length; j++) {
                payment += list[j].getService().getPrice() * list[j].getQuantity();
            }
            System.out.println("Tổng hoá đơn khách hàng phải trả  " + billManagement.getCustomer().getName() + " là " + payment);
        }
    }

    private boolean checkData() {
        boolean checkDataSeller = false;
        for (int i = 0; i < customerLogic.getCustomers().length; i++) {
            if (customerLogic.getCustomers()[i] != null) {
                checkDataSeller = true;
                break;
            }
        }

        boolean checkDataItem = false;
        for (int i = 0; i < serviceLogic.getServices().length; i++) {
            if (serviceLogic.getServices()[i] != null) {
                checkDataItem = true;
                break;
            }
        }
        return checkDataSeller && checkDataItem;
    }
}
