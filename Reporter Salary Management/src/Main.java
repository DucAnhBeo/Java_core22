import entity.BaiViet;
import entity.Reporter;
import entity.ReportsManagementDetail;
import entity.ReportsManagemnet;

import java.util.Scanner;

public class Main {

    private static Reporter[] reporters = new Reporter[100];
    private static BaiViet[] baiViets = new BaiViet[100];
    private static ReportsManagemnet[] reportsManagemnets = new ReportsManagemnet[100];

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
                    writeReports();
                    break;
                case 6:
                    showReports();
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

    private static void showReports() {
        for (int i = 0; i < reportsManagemnets.length; i++) {
            if (reportsManagemnets[i] != null) {
                System.out.println(reportsManagemnets[i]);
            }
        }
    }

    private static void writeReports() {
        System.out.println("Co bao nhieu phong vien viet bai");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber; i++) {
            System.out.println("Nhap thong tin cho phong vien thu "+ (i+1));
            Reporter reporter = inputReporterForWritting();

            ReportsManagementDetail [] details = inputReportsManagementDetail();

            ReportsManagemnet reportsManagemnet = new ReportsManagemnet(reporter, details);
            saveReporterWritting(reportsManagemnet);
        }
    }

    private static void saveReporterWritting(ReportsManagemnet reportsManagemnet) {
        for (int j = 0; j < reportsManagemnets.length; j++) {
            if (reportsManagemnets[j] == null) {
                reportsManagemnets[j] = reportsManagemnet;
                break;
            }
        }
    }

    private static ReportsManagementDetail[] inputReportsManagementDetail() {
        System.out.println("Phong vien viet bao nhieu kieu bai viet");
        int baiVietNumber;
        do {
            baiVietNumber = new Scanner(System.in).nextInt();
            if (baiVietNumber > 0 && baiVietNumber < 6) {
                break;
            }
            System.out.println("So luong dau sach la mot so duong hon 6, vui long nhap lai");
        } while (true);
        ReportsManagementDetail[] details = new ReportsManagementDetail[baiVietNumber];
        int count = 0;
        for (int j = 0; j < baiVietNumber; j++) {
            System.out.println("Nhap thong tin cho kieu bai viet" + (j + 1));
            System.out.println("Nhap id cua kieu bai viet");

            int baiVietId;
            BaiViet baiViet = null;
            do {
                baiVietId = new Scanner(System.in).nextInt();

                for (int k = 0; k < baiViets.length; k++) {
                    if (baiViets[k] != null && baiViets[k].getId() == baiVietId) {
                        baiViet = baiViets[k];
                        break;
                    }
                }

                if (baiViet != null) {
                    break;
                }
                System.out.println("Khong co kieu bai viet mang ma " + baiVietId + "vui long nhap lai");
            } while (true);

            System.out.println("Phong vien viet kieu bai viet" + baiViet.getNameBai() + "bao nhieu lan");

            int quantity ;

            do {
                quantity = new Scanner(System.in).nextInt();
                if (quantity > 0 && quantity < 3) {
                    break;
                }
                System.out.println("So luong cuon sach muon cua moi dau sach khong vuot qua 3, vui long nhap lai");
            } while (true);
            ReportsManagementDetail detail = new ReportsManagementDetail(baiViet, quantity);
            details[count] = detail;
            count++;
        }
        return details;
    }


    private static Reporter inputReporterForWritting() {
        System.out.println("Nhap ma phong vien");
        Reporter reporter = null;
        int reporterID;
        do {
            reporterID = new Scanner(System.in).nextInt();

            for (int j = 0; j < reporters.length; j++) {
                if (reporters[j] != null && reporters[j].getId() == reporterID) {
                    reporter = reporters[j];
                    break;
                }
            }
            if (reporter!= null) {
                break;
            }
            System.out.println("Khong ton tai ban doc mang ma" + reporterID + "vui long nhap lai");
        } while (true);
        return reporter;
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
        System.out.println("6. In danh sach bang tinh cong");
        System.out.println("7. Sắp xếp danh sách theo ten");
        System.out.println("8. Sắp xếp danh sách theo so luong bai viet");
        System.out.println("9. Lap bang thong ke thu nhap");
        System.out.println("10. Thoát");
    }
}
