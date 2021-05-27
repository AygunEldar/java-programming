package April;
import  java.util.*;

public class ReversedArray_3_11 {
    public static void main(String[] args) {
       int [] nums={5,9,7,3,8,10};
        System.out.println("Before "+Arrays.toString(nums));
       int temp =nums[0];
       nums[0] =nums[5];
       nums[5]= temp;
       System.out.println(Arrays.toString(nums));

        System.out.println("*********REVERSE VARIAN 2 ***********");
        int[] nums2 ={5,9,7,3,8,10};

        for(int i = 0; i < nums2.length/2; i++) {
            int rev = nums2[i];
            nums2[i] = nums2[nums2.length-1-i];
            nums2[nums2.length-1-i] = rev;

        }
        System.out.println("After "+Arrays.toString(nums2));


        System.out.println("----REVERSE VARIANT --3----------------");
        int[] nums3 ={5,9,7,3,8,10};
        int rever [] = new int[nums3.length];

        for(int i =nums3.length-1,j=0;i >=0;i--,j++){
            rever[j] = nums3[i];
        }
        System.out.println(Arrays.toString(rever));
    }
}
