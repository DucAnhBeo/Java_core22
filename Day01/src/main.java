import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //System.out.println(travel(arr, arr.length));
       // System.out.println(sum(5));

        System.out.println(fib(100));
    }

    public static void travel (int[] arr, int i){
        if(i == arr.length) return ;
        System.out.println(arr[i]);
        travel(arr, i+1);
    }


    public static int sum(int n){
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }

    public static int fib(int n) {
        if(n<2) return n;

        return fib(n-1) + fib(n-2);
    }
}


