package mine_mine_20;

import java.sql.SQLOutput;

public class TernaryIntStringChar {
     public static void main(String [] args ) {

         int fee = 15;
         String paym = (fee > 5) ? "butter" : "cheese";
         System.out.println("Payment is for " + paym);
         System.out.println("******************************");
         
         String game = "voleyball";
         int score = (game.equals("voleyball")) ? 25 : 38;
         System.out.println("score = " + score);
         System.out.println("*******************************");

         int point =9;

         String numerals= (point % 10 ==0)? "teens" : "with ones";
         System.out.println("Our number is " + numerals);

         System.out.println("**********************************");

         int x = 15;
         char n =  (x < 8) ? 'a' :'b';
         System.out.println("n = " + n);

         System.out.println("***********************************");

         String lesson = "softskill";
         String teacher = (lesson.equals("java")) ? " Murodil||Saim " : "Nadir";
         System.out.println("teacher = " + teacher);


     }


}
