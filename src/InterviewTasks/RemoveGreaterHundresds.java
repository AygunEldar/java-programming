package InterviewTasks;

import june.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveGreaterHundresds {
    public static void main (String [] args){

        /*
        Given a list of Integers  (1,2,3,4,5,6,7,8,9,101,200,300)
         remove all values greater than 100. Use Arraylist
         */
        ArrayList <Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        System.out.println(list);
    }
    public static List<Integer> removeMore(List<Integer> list){

                   list.removeIf(n ->( n > 100));

        return list;
    }








}
