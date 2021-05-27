package officehour03_23_;

import java.util.Scanner;

public class WordEvenOdd {
 public static void main (String [] args) {

     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number");
     int num =input.nextInt();
     if(num>0){
     System.out.println("Enter just one  word");

     String word = input.next();
     if (word.length() % 2 == 0) {
         System.out.println(word + " is even length");
     } else {
         System.out.println(word + " is odd length");
     }
 }else{



        System.out.println("Enter the character");
        char letter = input.next().charAt(0);
        if (letter >= 'A' && letter <= 'Z') { //ASCII numbers you can write
            System.out.println("Upper case - " + letter);
        } else if (letter >= 'a' && letter <= 'z') {//ASCII numbers you can write
            System.out.println("Lower case - " + letter);
        } else {
            System.out.println("Not a valid letter");
        }

    }

 }
}
