package entity;

public abstract class Student {

    private String id;
    private String name;
    private String address;
    private float gpa;

    // day la phuong thuc ao abstract
    public abstract void study();

    public abstract void takeExam();

    public void study2() {
        System.out.println("Student is studying....");
    }
}
