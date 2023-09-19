package statics;

public enum BookType {

    SCIENCE("Khoa học"),

    LITERATURE_AND_ART("Văn học và nghệ thuật"),

    ELECTRON_AND_TELE("Điện tử viễn thông"),

    INFORMATION_TECH("Công nghệ thông tin");

    public String value;

    BookType(String value) {
        this.value = value;
    }
}
