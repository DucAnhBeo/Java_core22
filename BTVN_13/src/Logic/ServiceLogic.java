package Logic;

import Entity.Service;

import java.util.Scanner;

public class ServiceLogic {

    private Service[] services = new Service[100];

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public void inputService() {
        System.out.println("Nhập số lượng dịch vụ");
        int serviceNumber ;
        do {
            try {
                serviceNumber = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại");
            }
        } while (true);
        for (int i = 0; i < serviceNumber; i++) {
            System.out.println("Nhập thông tin cho dịch vụ thứ " + (i + 1));
            Service service = new Service();
            service.inputInfor();
            saveService(service);
        }
    }

    private void saveService(Service service) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] == null) {
                services[i] = service;
                break;
            }
        }
    }

    public void showService() {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null) {
                System.out.println(services[i]);
            }
        }
    }

    public Service searchServiceById(int serviceId) {
        for (int i = 0; i < services.length; i++) {
            if (services[i] != null && services[i].getId() == serviceId) {
                return services[i];
            }
        }
        return null;
    }
}

