package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {


        //id , names

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"James");
        map.put(9,"Bob");
        map.put(2,"Anna");
        map.put(8,"Ali");
        map.put(2,"Daria");
        map.put(100,"Maxim");
        map.put(101,"Maxim");

        System.out.println(map);
        System.out.println(map.get(100));//Maxim
        System.out.println(map.get(105));//null

             map.remove(1); //remove
        System.out.println("map.remove(2) = " + map.remove(2)); //print ...
        System.out.println(map);
        map.put(1,"Kinga");
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Ali"));

        for(Integer eachKey: map.keySet()){
            System.out.println(eachKey + " -" +map.get(eachKey));//keys + values
           // System.out.println(eachKey); //only keys

            if(map.get(eachKey).equals("Daria")){
                System.out.println("this is our key " +eachKey);
            }
        }
    }
}
