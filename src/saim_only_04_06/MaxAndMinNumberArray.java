package saim_only_04_06;
import java.util.*;

public class MaxAndMinNumberArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your numbers");

        int[] nums ={scan.nextInt(),scan.nextInt(),scan.nextInt()};

        Arrays.sort(nums);
        System.out.println("Min number is " +nums[0]+"\nmax number is "+nums[nums.length-1]);

    }
}
