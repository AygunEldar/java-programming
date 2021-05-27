package April;
import java.util.*;

public class Reverse_Array_Int_forLoop_1 {
    public static void main(String[] args) {

        int [] nums = {3,8,9,51};
        int [] revNum = new int [nums.length];

        for(int i =nums.length-1, j=0; i>=0;i--,j++){
            revNum[j] = nums[i];

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(revNum));
    }
}
