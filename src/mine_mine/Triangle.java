package mine_mine;
 import java.util.Scanner;

public class Triangle {
    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);
        System.out.println("Equllateral Triangle");

         int angle = input.nextInt();

         if ( angle == 180 / 3){
             System.out.println(" A valid triangle ");
         }else{
             System.out.println(" Not a valid triangle ");

         }
      //int angleOne = 100;
        //int angleTwo = 50;
        //int angleThree = 30;
        // int sum =angleOne + angleTwo +angleThree;
        //if sum ==180{
        // System.out.println("Valid triangle");
        // }else{
        // System.out.println("Invalid triangle");
        // }
       //System.out.println("******************");

        //boolean check =angleOne +angleTwo+ angleThree==180;
        //if (check){
        // System.out.println("Valid triangle");
        // }else{
        // System.out.println("Invalid triangle");
        // }

        //System.out.println("***********************");
        //if(angleOne +angleTwo+ angleThree!=180){
        // System.out.println("Valid triangle");
        // }else{
        // System.out.println("Invalid triangle");
        // }


    }
}
