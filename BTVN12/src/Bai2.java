import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c) && Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }
        String result2= "";
        for (int i = 0; i < result.length(); i++) {
            char a = result.charAt(i);
            if (i % 2 == 0) {
                result2 += Character.toLowerCase(a);
            } else {
                result2 += Character.toUpperCase(a);
            }
        }
        System.out.println(result2);
        System.out.println("Chuong trinh chua toi uu");
    }
}
