package entity;

import statics.BookType;

import java.util.Scanner;

public class Book {

    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookYear;
    private BookType bookType;
    private int quantity;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookYear='" + bookYear + '\'' +
                ", bookType=" + bookType +
                ", quantity=" + quantity +
                '}';
    }

    public void inputInfor(){
        System.out.println("Nhập tên mã sách ");
        this.setBookId(new Scanner(System.in).nextLine());
        System.out.println("Nhập tên sách mới ");
        this.setBookName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tên tác giả sách ");
        this.setBookAuthor(new Scanner(System.in).nextLine());
        System.out.println("Nhập năm xuất bản ");
        this.setBookYear(new Scanner(System.in).nextLine());
        System.out.println("Nhập loại chuyên ngành, chọn 1 trong các loại dưới đây");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học nghệ thuật");
        System.out.println("3. Điện tử viễn thông");
        System.out.println("4. Công nghệ thông tin");
        int type = new Scanner(System.in).nextInt();
        switch (type) {
            case 1:
                this.setBookType(BookType.SCIENCE);
                break;
            case 2:
                this.setBookType(BookType.LITERATURE_AND_ART);
                break;
            case 3:
                this.setBookType(BookType.ELECTRON_AND_TELE);
                break;
            case 4:
                this.setBookType(BookType.INFORMATION_TECH);
                break;
        }
    }
}
