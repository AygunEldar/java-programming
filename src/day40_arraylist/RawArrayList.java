package day40_arraylist;
import  java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        // 2 ways

        ArrayList list1 = new ArrayList();
         List list2 = new ArrayList();          //polimorphizim

        // ** default capacity is 10

        //add value

        list1.add("lava");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println("Size of the list = "+list1.size());










    }
}
