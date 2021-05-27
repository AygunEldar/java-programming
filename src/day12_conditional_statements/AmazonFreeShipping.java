package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);
        System.out.println(" Enter total price ");
         double price = scan.nextDouble();
         if (price > 25) {
             System.out.println("Free shipping eligible: $" + price);
         } else{
             System.out.println("Free shipping is not eligible: $" +price);
         }
  System.out.println("Thanks for shopping Amazon! ");
    }

}
