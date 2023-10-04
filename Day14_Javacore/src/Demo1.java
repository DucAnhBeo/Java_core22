import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        List list1 = new ArrayList();
        System.out.println(list1.size());

        ArrayList list2 = new ArrayList();

        list1.add(1);
        list1.add(false);
        System.out.println(list1.size());

        list1.remove("1");
        System.out.println(list1);
    }
}
