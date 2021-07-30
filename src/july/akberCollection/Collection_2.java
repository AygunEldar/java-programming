package july.akberCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collection_2 {
    public static void main(String[] args) {

        Collection<Integer>coll = new ArrayList<>(Arrays.asList(3,4,5,2,66,544,31) );
        System.out.println(coll);
       Iterator<Integer> myItor= coll.iterator();

       //hasNext()
        System.out.println(myItor.hasNext());

        //next();
//        System.out.println(myItor.next());//3
//        System.out.println(myItor.next());//4
//
//        //remove();
//        myItor.remove();
//        System.out.println(myItor.next());


        while (myItor.hasNext()){
            Integer each = myItor.next();
           System.out.print(each+ " ");

           if(each >  10){
               myItor.remove();
           }
        }
        System.out.println();

        System.out.println( coll );
    }
}
