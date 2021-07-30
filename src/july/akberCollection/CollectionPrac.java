package july.akberCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionPrac {
    public static void main(String[] args) {

        //common collection interface methods
        Collection<Integer>coll = new ArrayList<>();

        //add item
        coll.add(3);
        coll.add(10);
        coll.add(1);
        System.out.println(coll);

        //adding multiple items in one shot
        coll.addAll(Arrays.asList(3,4,5,6,7,8,70,35,9,0));
        System.out.println(coll);

        //getting size
        System.out.println("coll size now = " +coll.size());

        //checking empty or not
        System.out.println("coll.isEmpty() = " +coll.isEmpty());

        //remove item
        System.out.println("coll.remove(7) = " + coll.remove(7));  //by value
        System.out.println(coll);

        //contains item
        System.out.println("coll.contains(7) = " + coll.contains(7));

        //contains All items
        System.out.println("coll.containsAll(Arrays.asList(3,4)) = " + coll.containsAll(Arrays.asList(3, 4)));


        //remove All
        coll.removeAll(Arrays.asList(3,4,6));
        System.out.println(coll);


        System.out.println("coll.removeAll(Arrays.asList(14,17)) = " + coll.removeAll(Arrays.asList(14, 3, 17)));
        System.out.println(coll);

//      //retains All
//       coll.retainAll((Arrays.asList(5,8)));
//        System.out.println(coll);


        //removeIf
        coll.removeIf(each ->each > 10);
        System.out.println(coll);

        //Turning into array
        Integer[] inArray = coll.toArray(new Integer[0]);
        System.out.println(Arrays.toString(inArray));


    }

}
