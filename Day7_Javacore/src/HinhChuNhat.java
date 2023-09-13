public class HinhChuNhat {
    public float chieuDai;
    public float chieuRong;

    public HinhChuNhat(){
    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float chuVi(){
        return (chieuDai+chieuRong)*2;
    }

    public float dienTich(){
        return chieuRong*chieuDai;
    }
}
