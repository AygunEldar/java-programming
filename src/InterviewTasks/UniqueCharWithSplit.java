package InterviewTasks;

import day41_arraylist.ArraysAsList;

import java.util.Arrays;
import java.util.Collections;

public class UniqueCharWithSplit {
    public static void main(String[] args) {
          findUnique();
    }
    public static void  findUnique(){

       String str= "ABCCDHOOP";
       String result="";

       for(String each : str.split("")){
           result += ((Collections.frequency(Arrays.asList(str.split("")),each))==1) ? each : "";


       }
        System.out.println(result);
    }
}
