package saim_only_03_17;
import java.util.Scanner;
public class EligibleToVote {
    public static void main (String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age");
        boolean usCitizen = true;  //String country = scan.nextLine();
        int age = scan.nextInt();
                                 //
        if(usCitizen){
            if(age >= 18){
                System.out.println("You are eligible to vote");
            }else if ( age < 18){
                System.out.println(" You must be at least 18 years old to vote");
            }

        }else{
            System.out.println("you must be US citizen in order to vote");
        }

    }
}
