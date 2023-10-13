public class Demo2 {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        x=y;
        y++;
        System.out.println(x);
        System.out.println(y);

        System.out.println("____________________");

        SinhVien sv1 = new SinhVien();
        sv1.setGpa(10f);
        SinhVien sv2 = sv1;

        sv1.setGpa(5f);

        System.out.println(sv1);
        System.out.println(sv2);

        System.out.println("______________");

        String str1 = "Nguyen Van A";
        String str2 = "Nguyen Van B";

        str2 = str1;
        str2="ABC";
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("______________");
        String str3 = new String("Nguyen Van A");
        String str4 = new String("Nguyen Van B");

        str4 = str3;
        str3 ="ABC";

        System.out.println(str3);
        System.out.println(str4);

        System.out.println("______________");

    }
}