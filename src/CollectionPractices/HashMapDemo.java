package CollectionPractices;

import june.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap m = new HashMap();
        HashMap<Integer,String>m= new HashMap<>();
        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"Tye");
        m.put(103,"Sofia");
        m.put(106,"Ali");
        m.put(107,"Brenda");


        System.out.println(m);
        System.out.println(m.get(105));

        m.remove(104);
        System.out.println(m);

        System.out.println(m.containsKey(101));//true
        System.out.println(m.containsKey(104));//false

        System.out.println(m.containsValue("David"));//true
        System.out.println(m.containsValue("Mary"));//false

        System.out.println(m.isEmpty());//false

        System.out.println(m.keySet());//returns all keys as SET-[101, 102, 103, 105, 106, 107]
        for(Object i :m.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
      //  System.out.println(m.values());//returns as a COLLECTIONS-[John, David, Sofia, Tye, Ali, Brenda]
        for(Object i : m.values()){
            System.out.print(i +" ");
        }


        for(Object i : m.keySet()){
            System.out.println(i +"     "+ m.get(i));
        }


        //ENTRY METHODS
        System.out.println();
        System.out.println(m.entrySet());//returns all ENRTIES as SET object-[101=John, 102=David, 103=Sofia, 105=Tye, 106=Ali, 107=Brenda]
        System.out.println("****************");

        // for(Object entry : m.entrySet()){ // HashMap m = new HashMap();
         for(Map.Entry entry : m.entrySet()){ //  HashMap<Integer,String>m= new HashMap<>();

             System.out.println(entry.getKey()+"   "+ entry.getValue());
         }

         //ITERATOR METHODS
        Set s = m.entrySet();

         Iterator itr = s.iterator();

         while (itr.hasNext()){

             Map.Entry  entry = (Map.Entry) itr.next();
             System.out.println(entry.getKey() + "    " + entry.getValue());
         }

    }


}
