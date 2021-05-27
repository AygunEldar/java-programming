package saim_only_04_06;
import java.util.*;

public class AverageNumberFromArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number: ");

        int [] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),};

        int count =0;
        for(int i =0; i < nums.length; i++){
                 count += nums[i];
        }

   double average =count/nums.length;
 System.out.println("Average is "+ average);
}
    }

