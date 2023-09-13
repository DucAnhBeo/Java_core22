import java.time.LocalDate;

public class Student {

    public String id;
    public String fullName;
    public LocalDate birthday;
    public String address;
    public String className;
    public float gpa;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", className='" + className + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
