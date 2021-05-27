package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random randomNum = new Random();
 int secretNumber = randomNum.nextInt(101);
  int guessingNumber;
        do{
            System.out.println("Guess the secret number");
            guessingNumber= scan.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong, your number is too long");
            }else if(guessingNumber< secretNumber){
                System.out.println("Wrong, your number is too small");
            }
        }while(secretNumber !=guessingNumber);

        System.out.println("Congratulation , you won! Secret number: "+ secretNumber);
    }
}
// add a counter for attempt, max 5