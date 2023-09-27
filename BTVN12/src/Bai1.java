import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {

        for (int i = 100000; i < 1000000; i++) {
            if(isPalindromeNumber(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isPalindromeNumber(int n){
        String number = String.valueOf(n);

        for (int i = 0; i < number.length()/2; i++) {
            if (number.charAt(i) != number.charAt(number.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
