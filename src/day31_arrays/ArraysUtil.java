package day31_arrays;

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {

        int[] num ={5, 1, 7, 0, -4, 44, 33};

        System.out.println(Arrays.toString(num));

        System.out.println("****************SORTING*******");
//sort num rechange value of the array

        Arrays.sort(num);

//print after sorting toString
        System.out.println(Arrays.toString(num));
        System.out.println("min value " +num[0]);
        System.out.println("max value " + num[num.length-1]);

//Arrays.sort(num,Collections.reverseOrder)




    }
}
