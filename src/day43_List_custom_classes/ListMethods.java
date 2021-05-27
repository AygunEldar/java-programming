package day43_List_custom_classes;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(" getDays().size()"+ getDays().size());
        System.out.println(" getDays().get(0)"+ getDays().get(0));

        List<String> dayNames =getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        //removeIf method - java8 _> accepts lambda - and easy to remove without loop
        dayNames.removeIf(day ->day.length() ==6);
        System.out.println("dayNames after removeIf = " + dayNames);


        System.out.println(getRandomList(10));
        List<Integer>nums =getRandomList(100);
        System.out.println("nums size = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90); //remove nums less than 90
        System.out.println("nums less than 90 = " + nums);
    }
    public static List<String>getDays (){

        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));

        /*
        List <String>days =new ArrayList<>();
        days.add("Monday");days.add("Tuesday");days.add("Wednesday");days.add("Thursday");
        days.add("Friday");days.add("Saturday");days.add("Sunday");

        OR days.addAll(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
         */
        return days;
    }

    /**
     * getRandomList
     * int size
     * return List<Integer>
     *     generate random numbers(0-100) the count of size, and assign to List then return getRandom(3)_>43,12,54
     *     getRandomList(2) _> 1, 4
     */



  public static List<Integer>getRandomList(int size){

      Random  random = new Random();

      List<Integer>nums =new ArrayList<>();
      for(int i = 1 ; i <= size; i++){
//          int n= random.nextInt(101); // it prevents to print the same number
//          if(!nums.contains(n)){
//              nums.add(n);
//          }
          nums.add(random.nextInt(101));// generate random 0-100 limit number and add to list
      }
      return nums;
  }


}
