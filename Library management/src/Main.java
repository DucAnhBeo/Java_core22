
import entity.BookBorrowManagement;
import entity.BookBorrowManagementDetail;
import entity.Reader;
import entity.Book;


import java.util.Scanner;

public class Main {

    private static Reader[] readers = new Reader[100];
    private static Book[] books = new Book[100];
    private static BookBorrowManagement[] bookBorrowManagements = new BookBorrowManagement[100];


    public static void main(String[] args) {
        while (true) {
            printMenu();
            int functionChoice = chooseFunction();

            switch (functionChoice) {
                case 1:
                    inputReader();
                    break;
                case 2:
                    showReader();
                    break;
                case 3:
                    inputBook();
                    break;
                case 4:
                    showBook();
                    break;
                case 5:
                    borrowBook();
                    break;
                case 6:
                    showBorrow();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }
    }

    private static void showBorrow() {
        for (int i = 0; i < bookBorrowManagements.length; i++) {
            if (bookBorrowManagements[i] != null) {
                System.out.println(bookBorrowManagements[i]);
            }
        }
    }

    private static void borrowBook() {
        System.out.println("Co bao nhieu ban doc can muon sach");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhap thong tin cho ban doc thu " + (i + 1));
            Reader reader = inputReaderForBorrow();

            BookBorrowManagementDetail[] details = inputBookManagementDetail();

            BookBorrowManagement bookBorrowManagement = new BookBorrowManagement(reader, details);
            saveBookBorrow(bookBorrowManagement);
        }
    }

    private static BookBorrowManagementDetail[] inputBookManagementDetail() {
        System.out.println("Ban doc nay muon muon bao nhieu dau sach");
        int bookNumber;
        do {
            bookNumber = new Scanner(System.in).nextInt();
            if (bookNumber > 0 && bookNumber < 6) {
                break;
            }
            System.out.println("So luong dau sach la mot so duong hon 6, vui long nhap lai");
        } while (true);
        BookBorrowManagementDetail[] details = new BookBorrowManagementDetail[bookNumber];
        int count = 0;
        for (int j = 0; j < bookNumber; j++) {
            System.out.println("Nhap thong tin cho dau sach" + (j + 1));
            System.out.println("Nhap id cua sach");

            int bookId;
            Book book = null;
            do {
                bookId = new Scanner(System.in).nextInt();

                for (int k = 0; k < books.length; k++) {
                    if (books[k] != null && books[k].getId() == bookId) {
                        book = books[k];
                        break;
                    }
                }

                if (book != null) {
                    break;
                }
                System.out.println("Khong co dau sach mang ma " + bookId + "vui long nhap lai");
            } while (true);

            System.out.println("Ban muon muon dau sach " + book.getName() + "bao nhiue cuon");

            int quantity ;

            do {
                quantity = new Scanner(System.in).nextInt();
                if (quantity > 0 && quantity < 4) {
                    break;
                }
                System.out.println("So luong cuon sach muon cua moi dau sach khong vuot qua 3, vui long nhap lai");
            } while (true);
            BookBorrowManagementDetail detail = new BookBorrowManagementDetail(book, quantity);
            details[count] = detail;
            count++;
        }
        return details;
    }

    private static Reader inputReaderForBorrow() {
        System.out.println("Nhap ma ban doc muon muon sach");
        Reader reader = null;
        int readerId;
        do {
            readerId = new Scanner(System.in).nextInt();

            for (int j = 0; j < readers.length; j++) {
                if (readers[j] != null && readers[j].getId() == readerId) {
                    reader = readers[j];
                    break;
                }
            }
            if (reader != null) {
                break;
            }
            System.out.println("Khong ton tai ban doc mang ma" + readerId + "vui long nhap lai");
        } while (true);
        return reader;
    }

    private static void saveBookBorrow(BookBorrowManagement bookBorrowManagement) {
        for (int j = 0; j < bookBorrowManagements.length; j++) {
            if (bookBorrowManagements[j] == null) {
                bookBorrowManagements[j] = bookBorrowManagement;
                break;
            }
        }
    }


    private static void inputBook() {
        System.out.print("Có bao nhiêu dau sach thêm mới: ");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhập thông tin cho dau sach thu" + (i + 1));
            Book book = new Book();
            book.inputInfor();
            saveBook(book);
        }
    }

    private static void saveBook(Book book) {
        for (int j = 0; j < books.length; j++) {
            if (books[j] == null) {
                books[j] = book;
                break;
            }
        }
    }

    private static void showBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }


    private static void showReader() {
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null) {
                System.out.println(readers[i]);
            }
        }
    }

    private static void inputReader() {
        System.out.print("Có bao nhiêu bạn đọc muốn thêm mới: ");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thu" + (i + 1));
            Reader reader = new Reader();
            reader.inputInfor();
            saveReader(reader);
        }
    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if (readers[j] == null) {
                readers[j] = reader;
                break;
            }
        }

    }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng:  ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.println("Chức năng không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return functionChoice;
    }

    private static void printMenu() {
        System.out.println("-----------------PHẦN MỀN QUẢN LÍ MƯỢN SÁCH-----------");
        System.out.println("1. Nhập bạn đọc mới.");
        System.out.println("2. In danh sách bạn đọc");
        System.out.println("3. Nhập sách mới");
        System.out.println("4. In danh sách các cuốn sách");
        System.out.println("5. Lập bảng mượn sách");
        System.out.println("6. In danh sách mượn sách");
        System.out.println("7. Sắp xếp danh sách mượn sách");
        System.out.println("8. Tìm kiếm trong danh sách mượn sách");
        System.out.println("9. Thoát");
    }
}