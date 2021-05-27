package April;
import java.util.*;

public class ArrayUtil_07 {
    public static void main(String[] args) {

        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in same line
  System.out.println(Arrays.toString(nums));

   Arrays.sort(nums);
   System.out.println("It is a min number "+nums[0]);

   System.out.println("It is a max number " +nums[nums.length-1]);

    }

}
