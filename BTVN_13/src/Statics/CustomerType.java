package Statics;

public enum CustomerType {

    CÁ_NHÂN("cá nhân"),
    ĐẠI_DIỆN_ĐƠN_VỊ_HÀNH_CHÍNH("đại diện đơn vị hành chính"),
    ĐẠI_DIỆN_ĐƠN_VỊ_KINH_DOANH("đại diện đơn vị kinh doanh");

    public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
