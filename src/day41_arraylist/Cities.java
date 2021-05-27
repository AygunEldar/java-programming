package day41_arraylist;

import java.util.*;

public class Cities {
   public static void main (String [] args){
       //declare arrayList
       ArrayList<String>cities = new ArrayList<>();
       //add cities to arraylist  -> .add
       cities.add("Washington DC");
       cities.add("New York");
       cities.add("Vienna");
       cities.add("Adana");
       cities.add("LA");


       //add Ashgabat to be first
       cities.add(0,"Ashgabat");
       System.out.println(cities);
      // System.out.println(cities.size());

       //print first and last cities

      System.out.println("first city is "+cities.get(0));
      System.out.println("last city is "+cities.get(cities.size()-1));

       //print count of items in arraylist
      System.out.println("count of items = " + cities.size());

       int numOfCities = cities.size();
       System.out.println("There are " +numOfCities+" cities in the list");

       // for loop and print all values in  the same line

       for(int i=0; i< cities.size(); i++){
          System.out.print(cities.get(i)+" ");

       }
       System.out.println();

       //half of the list
       for(int n =0; n < cities.size() /2;n++){
           System.out.println(cities.get(n));
       }

       for(String each : cities){
      //     System.out.println(each + " ");
       }
       System.out.println();

       //delete item from arrayList
       //1)remove using index  --delete value in index 3
       cities.remove(3);
       //2) remove using object/value
       cities.remove("New York");
       System.out.println("after removing" + cities);

       // delete / remove all values from list  --> clear (removeAll is different)

       cities.clear();

       //make sure it is clear
       // 1) print  | spit it out
       System.out.println("cities = " + cities);

       //2) using  isEmpty
       if(cities.isEmpty()){
           System.out.println("List is empty");
       }
     //3) check size() ==0
       if(cities.size()==0){
           System.out.println("List is empty");
       }
   }

}
