package interviewTasks_Saim_Maps;

import java.beans.IntrospectionException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_frequency_eachCharachter {
    public static void main(String[] args) {
         frequencyTest("AABBBCDDDDEEEEE");
    }
    public static void frequencyTest(String str){

       Map<Character, Integer> map = new LinkedHashMap<>();

       for(Character each : str.toCharArray()){

           if(map.containsKey(each)){

               map.put(each,map.get(each)+1);

           }else{

               map.put(each,1);
           }
       }
        System.out.println(map);
    }
}
