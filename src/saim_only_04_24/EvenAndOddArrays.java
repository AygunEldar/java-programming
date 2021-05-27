package saim_only_04_24;

import java.util.Arrays;

public class EvenAndOddArrays {
    public static void main(String[] args) {

        int[] nums ={1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int  evens=0;
        int odds = 0;

        for(int each : nums){
            if(each % 2 == 0){
                evens++;

            }else {
                odds++;
            }
        }
        int [] evenArray = new int[evens];
        int [] oddArray =new int[odds];
        for(int i = 0, e = 0, o = 0; i < nums.length;i++){
            if(nums[i] % 2 ==0){
                evenArray [e++] =nums[i];

            }else{
                oddArray [o++] = nums[i];
            }
        }
        System.out.println("Even numberArray -> "+ Arrays.toString(evenArray));
        System.out.println("Odd numberArray -> "+ Arrays.toString(oddArray));
    }
}
