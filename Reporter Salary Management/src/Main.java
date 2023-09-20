import entity.BaiViet;
import entity.Reporter;

import java.util.Scanner;

public class Main {

    private static Reporter[] reporters = new Reporter[100];
    private static BaiViet[] baiViets = new BaiViet[100];

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int functionChoice = chooseFunction();

            switch (functionChoice) {
                case 1:
                    inputReporter();
                    break;
                case 2:
                    showReporter();
                    break;
                case 3:
                    inputBaiViet();
                    break;
                case 4:
                    showBaiViet();
                    break;
                case 5:
                    break;
                case 6:
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

    private static void showBaiViet() {
        for (int i = 0; i < baiViets.length; i++) {
            if (baiViets[i] != null) {
                System.out.println(baiViets[i]);
            }
        }
    }

    private static void inputBaiViet() {
        System.out.print("Có bao nhiêu bai viet muốn thêm mới: ");
        int baiVietNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < baiVietNumber; i++) {
            System.out.println("Nhập thông tin cho phong vien thu" + (i + 1));
            BaiViet baiViet = new BaiViet();
            baiViet.inputInfor();
            saveBaiViet(baiViet);
        }
    }

    private static void saveBaiViet(BaiViet baiViet) {
        for (int j = 0; j < baiViets.length; j++) {
            if (baiViets[j] == null) {
                baiViets[j] = baiViet;
                break;
            }
        }

    }

    private static void showReporter() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }

    private static void inputReporter() {
        System.out.print("Có bao nhiêu phong vien muốn thêm mới: ");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thu" + (i + 1));
            Reporter reporter = new Reporter();
            reporter.inputInfor();
            saveReporter(reporter);
        }
    }

    private static void saveReporter(Reporter reporter) {
        for (int j = 0; j < reporters.length; j++) {
            if (reporters[j] == null) {
                reporters[j] = reporter;
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
        System.out.println("-----------------PHẦN MỀN QUẢN LÍ LƯƠNG PHÓNG VIÊN-----------");
        System.out.println("1. Nhập danh sach phong vien.");
        System.out.println("2. In danh sách phong vien");
        System.out.println("3. Nhập danh sach kieu bai viet");
        System.out.println("4. In danh sách kieu bai viet");
        System.out.println("5. Lập bảng tinh cong");
        System.out.println("6. Sap xep danh sách theo ho ten phong vien");
        System.out.println("7. Sắp xếp danh sách theo so luong bai viet");
        System.out.println("8. lap bang ke thu nhap cua moi phong vien");
        System.out.println("9. Thoát");
    }
}
