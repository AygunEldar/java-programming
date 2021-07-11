package interviewTasks_Saim;

import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args) {
//        int[] num1={2,6,5,};
//        int[] num2={8,9,15};
//
//        int [] sum = new int[num1.length];
//        for (int i = 0; i < num1.length; i++) {
//
//             sum[i]= num1[i] + num2[i];
//            System.out.print(sum[i]+" ");

         int[] arr1 ={4,7,8};
         int[] arr2 = {3,6,5};

      // System.out.println(concatTwoArrays(Arrays.toString(arr1,arr2)));
        }


    public static int[] concatTwoArrays(int[] arr1,int[] arr2){

        int [] sum  = new int [arr1.length + arr2.length];

        int i = 0;
        for(int each : arr1){
            sum[i++]=each;
        }
        for(int each2 : arr2){
            sum[i++]=each2;
        }
        return sum;
    }
}
