public class Demo3 {

    public static void main(String[] args) {

        String str = "Apple";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result.concat(String.valueOf(c));
        }
        System.out.println(result);
    }
}
