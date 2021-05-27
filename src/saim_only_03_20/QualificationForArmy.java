package saim_only_03_20;

import java.sql.SQLOutput;

public class QualificationForArmy {
    public static void main(String []args){

        String citiz = "US";
        boolean resident = true;


  if(citiz.equalsIgnoreCase("US")|| resident == true){
     // System.out.println("Your are US citizen or resident");
           int age = 18;
      if(age>=18 && age <=35) {
          //System.out.println("You age is suitable");
          boolean highDip = true;
          if (highDip) {
              System.out.println("You are qualified for The US Army");
          } else {
              System.out.println("You must have a diploma");
          }
      }else{
          System.out.println("Your age must be between 18 and 35");
      }
  }else{
      System.out.println("You must be US citizen  or a resident");
  }
        System.out.println();
    }
}
