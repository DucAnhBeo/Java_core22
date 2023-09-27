public class Demo5 {

    public static void main(String[] args) {

        String str = "Nguyen Van A";// bat bien

        StringBuilder sb = new StringBuilder("Nguyen Van A");// khong bat bien

        System.out.println(str);
        System.out.println(sb);

        //    System.out.println(sb.reverse());
        sb.append(1);
        System.out.println(sb);
        sb.append('0');
        System.out.println(sb);
        sb.append("nguyen van b");
        System.out.println(sb);

        String s = sb.toString();

        System.out.println("_______________");
        System.out.println(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
