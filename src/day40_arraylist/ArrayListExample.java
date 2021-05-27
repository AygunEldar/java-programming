package day40_arraylist;

import java.util.*;            // ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);

        //ERROR because  INTEGER declared  nums.add("java");

        System.out.println("Size = " +nums.size());


        //reading from ArrayList
        System.out.println("index 0 = " +nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
       // System.out.println("index 3 = " + nums.get(3));-- indexOutOfBoundsExpectation

        //print all values in same line:
        System.out.println(nums); // ArrayList just it
                                 //Array Arrays.toString(numArray)

        nums.remove(1); //remove at index 1
        System.out.println(nums);



    }
}
