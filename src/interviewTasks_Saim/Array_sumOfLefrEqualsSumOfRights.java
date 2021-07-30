package interviewTasks_Saim;

import june.main;

import java.util.Arrays;

/*
 Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example :
            Given [4, 9, 1, 3, 6, 4]
            your function should give item 1, because 4+9 = 3+6+4
 */
public class Array_sumOfLefrEqualsSumOfRights {

    public static void main(String[] args) {
    int[] nums = {4,9,1,3,6,4};

        System.out.println(Arrays.toString(equalSides(nums)));
    }
 public static int[] equalSides(int[] arr){

        for (int i = 0 ; i < arr.length;i++){
            int sumOfRight = 0;
            int sumOfLeft = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += arr[j];
            }

            for (int n = 0; n < arr.length; n++) {
                sumOfRight += arr[n];
            }

            if(sumOfLeft==sumOfRight){
                System.out.println(arr[i]);
            }
        }
     return arr;
 }

}
