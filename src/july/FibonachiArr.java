package july;

import java.util.Arrays;

public class FibonachiArr {

    public static void main(String[] args) {

        fib(8);
    }



    public static void fib(int num){

        int []arr = new int[num];

        arr[0] =0;
        arr [1] =1;

        for (int i = 2; i < arr.length; i++) {
                         arr[i] = arr[i-1] + arr[i -2];

        }
        System.out.println(Arrays.toString(arr));
    }

}
