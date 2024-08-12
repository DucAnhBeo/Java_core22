package entity;

import java.util.Scanner;

public class Receiver {
    private long STK;

    public long getSTK() {
        return STK;
    }

    public void setSTK(long STK) {
        this.STK = STK;
    }

    public void input (){
        System.out.println("Nhập STK cần chuyển");
        this.setSTK(new Scanner(System.in).nextInt());
    }
}
