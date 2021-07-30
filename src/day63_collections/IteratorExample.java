package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Jamie");
        list.add("Jane");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        it.next();
        it.remove();

        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Kinga");
        names.add("MJ");
        names.add("John");
        names.add("Ali");

       Iterator<String> iterator = names.iterator();

       while (iterator.hasNext()){

           String currentName = iterator.next();
           System.out.println(iterator);

           if(currentName.length() <  3 || currentName.startsWith("j") ){
               iterator.remove();
           }
       }
        System.out.println(names);
    }

}
