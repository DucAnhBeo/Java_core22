public class Demo4 {

    public static void main(String[] args) {

        char character = 'n';
        String str= "Nguyen Van A";
        boolean abc = abc(str, character);
    }

    public static boolean abc(String str, char character) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }
}
