import java.util.Scanner;
public class Ex2 {
    public static int sum(String n)
    {
        int sum=0;
        for(int i=0;i<=n.length()-1;i++){
            char digitChar = n.charAt(i);
            int chuSo = Character.getNumericValue(digitChar);
            sum += chuSo;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String n;
        n=sc.nextLine();

        System.out.println(sum(n));
    }


}
