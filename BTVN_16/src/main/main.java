package main;
import logichandle.MenuManagement;

public class main {

    public static void main(String[] args) {
        MenuManagement menuManagement = new MenuManagement();
        menuManagement.initializeData();
        menuManagement.run();
    }
}
