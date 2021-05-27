package saim_only_04_06;
import java.util.*;

public class EvenAndOddFromArray {
    public static void main(String[] args) {


        int[] nums = {4, 1, 3, 12, 5};
        int countEven = 0;
        int countOdd = 0;
        for (int each : nums) {


            if (each % 2 == 0) {
                countEven++;

            } else {
                countOdd++;

            }

        }
        System.out.println("Odd " + countOdd);
        System.out.println("Even " + countEven);

    }


    }

