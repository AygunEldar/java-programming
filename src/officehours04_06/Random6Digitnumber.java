package officehours04_06;
import java.util.*;

public class Random6Digitnumber {
    public static void main (String [] args){

        Random random = new Random();
        String randomNumber = "";
        while(randomNumber.length() < 6){     // !=

            int eachRandom   = random.nextInt(10);
            if(!randomNumber.contains(""+eachRandom)){
                randomNumber += eachRandom;
            }

        }
        System.out.println("Random number " + randomNumber);



    }
}
