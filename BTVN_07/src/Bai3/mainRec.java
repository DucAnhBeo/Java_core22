package Bai3;

import java.util.Scanner;

public class mainRec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu rong ");
        double width = scanner.nextDouble();

        System.out.print("Nhap chieu dai ");
        double height = scanner.nextDouble();

        System.out.print("Nhap mau sac ");
        String color = scanner.next();

        Rectangle rec = new Rectangle(width, height, color);

        System.out.println("Thuoc tinh hinh chu nhat");

        System.out.println("Chieu rong la " + rec.getWidth());

        System.out.println("Chieu dai la "  + rec.getHeight());

        System.out.println("Mau sac la " + rec.getColor());

        System.out.println("Dien tich la " + rec.findArea());

        System.out.println("Chu vi la " + rec.findPerimeter());
    }
}

