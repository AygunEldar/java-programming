package interviewTasks_Saim.All_Arrays;

import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int [] nums = {5,78,96,35};
        System.out.println(findMax(nums));

    }
    public static int findMax(int[] nums){

        Arrays.sort(nums);
        int max = nums[nums.length-1];

        return max;
    }
}
