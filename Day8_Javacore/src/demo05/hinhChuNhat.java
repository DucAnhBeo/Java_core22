package demo05;

import java.util.Scanner;

public class hinhChuNhat {

    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double area() {
        return this.width*this.height;
    }

    public double perimeter() {
        return 2*(this.width+this.height);
    }

    public void inputInfo(){
        System.out.println("Nhap chieu dai");
        this.width= new Scanner(System.in).nextFloat();
        System.out.println("Nhap chieu rong");
        this.height= new Scanner(System.in).nextFloat();
    }
}
