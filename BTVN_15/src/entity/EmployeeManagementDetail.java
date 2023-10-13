package entity;

public class EmployeeManagementDetail {

    private Employee employee;
    private Factory factory;
    private int workday;

    public EmployeeManagementDetail(Factory factory, int workday) {
        this.factory = factory;
        this.workday = workday;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Factory getFactory() {
        return factory;
    }

    public int getWorkday() {
        return workday;
    }

    @Override
    public String toString() {
        return "EmployeeManagementDetail{" +
                "factory=" + factory +
                ", workday=" + workday +
                '}';
    }


}
