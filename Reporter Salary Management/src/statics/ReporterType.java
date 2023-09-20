package statics;

public enum ReporterType {

    CHUYENNGHIEP("Chuyen Nghiep"),
    NGHIEPDU("Nghiep du"),
    CONGTACVIEN("Cong tac vien");

    public String value;

    ReporterType(String value) {
        this.value = value;
    }
}
