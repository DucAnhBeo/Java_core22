import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        str = str.trim();

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        String result = " ";
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }

        System.out.println(result);


    }
}
