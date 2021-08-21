package july;

import june.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMax {

   /**
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String [] args){

        int [] arr= {6,5,8,7,1,2,3};
        findMax(arr);

        ArrayList<Integer>nums= new ArrayList<>(Arrays.asList(4,8,9,23,4));
        findMax1(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(5,26,1,9,7));
        findMin(nums2);

        System.out.println(nums2);

    }

    public static void findMax(int [] num){

        int max =0;
        for (int each : num){
            if(each > max){
                max = each;
            }
        }
        System.out.println(max);
        System.out.println("************************");
    }

    public static void findMax1(ArrayList<Integer>list){

        System.out.println(Collections.max(list));



    }
    public static  void findMin(ArrayList<Integer>list2){

        System.out.println(Collections.min(list2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public static int findMax3(int[] arr2){

        Arrays.sort(arr2);
        int max = arr2[arr2.length - 1];

        return max;
    }


}
