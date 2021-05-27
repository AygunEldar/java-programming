package saim_only_03_30;
import  java.util.*;

public class RandomNumber6digit {
    public static void main (String [] args){

        Random random =new Random();
        String randomNum = "";

        while(randomNum.length() !=6){
            int eachNum = random.nextInt(10);
            if(!randomNum.contains(""+eachNum)){
                randomNum += eachNum;
            }
        }
        System.out.println("The random number is " + randomNum);
    }
}
