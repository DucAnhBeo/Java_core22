import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        str = str.trim();
        String[] words = str.split(" ");

        if (words.length > 20) {
            System.out.println("Sai");
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 10){
                System.out.println("sai");
                return;
            }
        }

//        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i]=words[j];
                    words[j] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+" ");
        }
    }
}
