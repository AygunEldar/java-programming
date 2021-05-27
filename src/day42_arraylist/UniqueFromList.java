package day42_arraylist;

import java.util.*;


public class UniqueFromList {
    public static void main(String[] args) {
// declare Integer ArrayList with following  numbers
        List<Integer>nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);

        System.out.println("\nuniqueList = " + uniqueList);


    }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new ArrayList to store unique numbers
        List <Integer> uniqueList = new ArrayList<>();

        // loop through the list
        for(int each : nums){
            //check if number appears ONCE in the list
            if(Collections.frequency(nums,each)==1){
                //print that number
                System.out.print(each +" ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
