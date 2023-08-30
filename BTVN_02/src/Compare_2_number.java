import java.util.Scanner;

import java.util.Random;

public class Compare_2_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Random rand =new Random();
        int ranNum = rand.nextInt(100)+1;

        int number;
        number=sc.nextInt();

        String a=(number < ranNum)?"Bigger" : "Smaller";
        System.out.println(ranNum);
        System.out.println(a);
    }
}
