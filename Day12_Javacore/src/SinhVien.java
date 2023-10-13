public class SinhVien {

    private int id;
    private String name;
    private float gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }
}
