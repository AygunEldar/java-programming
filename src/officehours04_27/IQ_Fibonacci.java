package officehours04_27;
import java.util.*;

public class IQ_Fibonacci {
    public static void main(String[] args) {
            fib(9);
    }

    public static void fib (int num){

        int[] arr = new int [num];
        arr[0] = 0;
        arr[1] = 1;

        for(int i= 2; i <arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];

        }
        System.out.println(Arrays.toString(arr));
    }
}
