import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        str = str.trim();
        String[] words = str.split(" ");

        String name = words[2];
        String surName = words[0];
        String middleName = words[1];

        String newStr = name +" "+ surName+" "+middleName;
        System.out.println(newStr);
    }
}
