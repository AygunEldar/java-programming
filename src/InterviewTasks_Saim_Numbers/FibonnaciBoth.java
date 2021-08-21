package InterviewTasks_Saim_Numbers;

import java.util.Arrays;

public class FibonnaciBoth {
    public static void main(String[] args) {
//fibon(8);
fibonacci(10);
    }
    public static void fibon(int num){

       int result = 0;
       int num1 =0;
       int num2 = 1;
        for (int i = 1; i <  num; i++) {
            System.out.print(num1 + " ");
            result = num1 + num2;
            num1= num2;
            num2 = result;

        }

    }
    public static void fibonacci(int num) {

         int []arr = new int[num];
         arr[0] = 0;
         arr[1] = 1;

        for (int i = 2; i < num ; i++) {

            arr[i] = arr[i-1] + arr[i - 2];

        }
        System.out.println(Arrays.toString(arr));
    }
}
