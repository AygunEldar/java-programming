package interviewTasks_Saim.All_Arrays;

import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) {

        int[] nums= {5,9,3,10,6};
        System.out.println(findMin(nums));

        int[] nums1 ={};
    }
    public  static int findMin(int[] nums) {

        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }

    //FIND MIN WITHOUT ARRAYS.SORT
    public static int findMin1(int[] nums1){
        int min = nums1[0];

        for (int i = 0; i < nums1.length; i++){

            if(min > nums1[i]){
                min =nums1[i];
            }

        }

        return min;
    }
}
