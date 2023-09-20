package entity;

public class ReportsManagementDetail {

    private BaiViet baiViet;
    private int quantity;

    public ReportsManagementDetail(BaiViet baiViet, int quantity) {
        this.baiViet = baiViet;
        this.quantity = quantity;
    }

    public BaiViet getBaiViet() {
        return baiViet;
    }

    public void setBaiViet(BaiViet baiViet) {
        this.baiViet = baiViet;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ReportsManagementDetail{" +
                "baiViet=" + baiViet +
                ", quantity=" + quantity +
                '}';
    }
}
