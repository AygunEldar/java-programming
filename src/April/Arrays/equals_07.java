package April.Arrays;
import java.util.*;

public class equals_07 {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        System.out.println(Arrays.equals(nums1,nums2));
        System.out.println(Arrays.equals(nums1,nums3));
        System.out.println(Arrays.equals(nums4,nums5));



        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};
        System.out.println(Arrays.equals(cars1,cars2));
        System.out.println(Arrays.equals(cars1,cars3));

        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
}
