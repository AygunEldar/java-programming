package repls04;
import java.util.*;

public class UniqueNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
       int count =0;
        for(int n =0;n < nums.length; n++){
            for(int k =0; k < nums.length;k++){
                if( n !=k && nums[n] == nums[k]){
                    count++;
                }
            }
            if(count ==0){
                System.out.println(nums[n]);
            }
        }
    }



}




