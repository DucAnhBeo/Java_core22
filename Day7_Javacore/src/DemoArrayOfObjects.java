import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArrayOfObjects {
    public static void main(String[] args) {

        int x=5;
        Student sv=new Student();

        int[] a=new int[10];
        Student[] students = new Student[10];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(students));

        System.out.println();
    }
}
