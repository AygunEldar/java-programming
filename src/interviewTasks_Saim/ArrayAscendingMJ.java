package interviewTasks_Saim;

import java.util.ArrayList;

public class ArrayAscendingMJ {
    public static void main(String[] args) {

        int [] nums = {1,8,9,7,5,6,3,};
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : nums) {
            result.add(each);

        }
        System.out.println(result);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){             //  < - descending 9,8,7,6,5,3,1
                    count++;
                }
            }
           result.set(count , nums[i]);
            count = 0;

        }
        System.out.println(result);
    }
}
