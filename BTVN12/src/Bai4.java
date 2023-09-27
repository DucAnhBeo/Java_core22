import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        str = str.trim();
        String[] words = str.split(" ");


        int max = 0;
        int pos = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= max) {
                max = words[i].length();
                pos = i;
            }
        }
        System.out.println("Tu dai nhat la" + " " + words[pos] + " " + "o vi tri" + (pos + 1));
    }
}
