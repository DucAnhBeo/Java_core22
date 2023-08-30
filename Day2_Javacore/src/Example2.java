
import java.lang.Math;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        String myName ="DucEng";
        String yourName; //null

        System.out.println(myName);
      //  System.out.println(yourName);

        String s1="Nguyễn";
        String s2="Nguyen";
        String s3="Nguyễn";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("------------------------");

        String str1="Java";
        String str2="Ja";
        String str3="Java1";
        String str4="va";
        System.out.println(str1.startsWith(str2));
        System.out.println(str3.startsWith(str1));
        System.out.println(str1.endsWith(str4));

        System.out.println("------------------------");
        System.out.println(str1.charAt(0));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));

        System.out.println("------------------------");
        String str10 = "nguyen van a";
        String str11 = " Nguyễn Van A";
        String str12 = "      nguyen     van      a";
        System.out.println(str10.toUpperCase());
        System.out.println(str11.toLowerCase());
        System.out.println(str12.trim());

        System.out.println(str10.substring(3,10));
        System.out.println(str10.replace("van", "Thi"));
        System.out.println(str10.split(("a")));

        System.out.println("------------------------");


    }
}
