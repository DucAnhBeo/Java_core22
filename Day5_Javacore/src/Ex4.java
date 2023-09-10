import java.util.Scanner;

public class Ex4 {
    public static int[][] inArray() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]");
                a[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        return a;
    }

    public static void MaxArrays(int[][] a){
        int max=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }

    public static void MinArrays(int[][] a){
        int min=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        System.out.println(min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = inArray();
        MaxArrays(a);
        MinArrays(a);
    }
}
