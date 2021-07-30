package April.ElgunAZE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElgunMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("person",5);
        map.put("student",8);
        map.put("teacher",12);

        //map.keySet() will return Set interface that is why keys must be unique
        Set<String> keys = map.keySet();
        System.out.println(keys);

        //map.value() method will return Collection
        Collection<Integer> values = map.values();
        System.out.println(values);

        for(String each : map.keySet()){
            //System.out.println(each + " " + map.get(each));
            if(each.equals("student")){
                map.put(each,20);
                System.out.println(each + " " + map.get(each));
            }
        }
        //remove specify keys from map
//        if(map.containsKey("student")){
//            map.remove("student");
//        }

        System.out.println(map);

        //replace specific keys value
        map.replace("student",230);

        System.out.println(map);

        //replace keys old value new value
        map.replace("student",230,231);
        System.out.println(map);
        int num = map.get("student");
        map.remove("student");
        map.put("new student",num);
        System.out.println(map);


    }
}
