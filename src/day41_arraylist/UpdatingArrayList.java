package day41_arraylist;

import java.util.*;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list

        List<String>myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("Moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");
        System.out.println(myCars.toString());//prints all cars
        String allCarsIn1St = myCars.toString(); //saves all cars in 1  string variables

        System.out.println("allCarsIn1St = " +allCarsIn1St );

        //change index 0 to lamborghini
        myCars.set(0,"Lamborghini");
        System.out.println("after set = " +myCars.toString());

        //change 4 to honda
        myCars.set(4,"honda");
        System.out.println("After set honda = " +myCars.toString());

        /**
         * how would you do that if myCars array?
         * myCars[4] ="honda";
         */

   // find the index number of ford -> we use indexOf
        System.out.println("index of ford = " +myCars.indexOf("ford"));

         int MoskvichIndex=myCars.indexOf("Moskvich");
        System.out.println("MoskvichIndex = " +MoskvichIndex);

        //change Moskvich to jiguli

        myCars.set(MoskvichIndex,"jiguli");
        System.out.println("After changing moskivich to jiguli = " +myCars);


        //replace ford with trabant



//        int fordIndex = myCars.indexOf("ford");
//        myCars.set(fordIndex,"trabant");
           myCars.set(myCars.indexOf("ford"),"trabant");
        System.out.println("After replacing ford to trabant ="+ myCars);


        // lada -> bugatti
        /*
        if myCars contains"lada"
        find index of lada and set with bugatti
        else
        print lada is not found
         */


  if(myCars.contains("lada")){
      myCars.set(myCars.indexOf("lada"),"bugatti");
  }else{
      System.out.println("Lada is not found");
  }
        System.out.println("After setting lada to bugatti " +myCars.toString());

  /**
 lamborgini  ->prius
 lada        -> lexus
 traban        -> audi
   */

  for(int i= 0; i <myCars.size();i++){

      if(myCars.get(i).equals("Lamborghini")){
          myCars.set(i,"prius");
      }else if(myCars.get(i).equals("yugo")){
          myCars.set(i,"lexus");
      }else if(myCars.get(i).equals("trabant")){
          myCars.set(i,"audi");
      }

  }
        System.out.println("after loop = " +myCars);

    }
}
