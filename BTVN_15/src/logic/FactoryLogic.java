package logic;

import entity.Factory;

import java.util.Scanner;

public class FactoryLogic {

    private Factory[] factories = new Factory[1000];

    private int totalFactory;

    public Factory[] getFactories() {
        return factories;
    }

    public int getTotalFactory() {
        return totalFactory;
    }

    public void addNewFactory() {
        System.out.print("Nhập số lượng xưởng sản xuất thêm mới: ");
        int FactoryNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < FactoryNum; i++) {
            System.out.println("Nhập thông tin cho loại bài viết thứ " + (i + 1));
            Factory factory = new Factory();
            factory.inputInfo();
            saveFactory(factory);
            System.out.println("----------------------");
        }
        totalFactory += FactoryNum;
    }

    private void saveFactory(Factory factory) {
        for (int i = 0; i < factories.length; i++) {
            if (factories[i] == null) {
                factories[i] = factory;
                break;
            }
        }
    }

    public void showFactory() {
        for (int i = 0; i < factories.length; i++) {
            if (factories[i] != null) {
                System.out.println(factories[i]);
            }
        }
    }

    public Factory searchById(int id) {
        Factory result = null;
        for (int k = 0; k < factories.length; k++) {
            if (factories[k] != null && factories[k].getId() == id) {
                result = factories[k];
                break;
            }
        }
        return result;
    }
}
