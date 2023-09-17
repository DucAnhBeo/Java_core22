package demo4;

import java.util.Scanner;

public class circle {

    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2*Math.PI*this.radius;
    }

    public void inputInfo(){
        System.out.println("Nhap ban kinh");
        this.radius= new Scanner(System.in).nextFloat();
    }
}
