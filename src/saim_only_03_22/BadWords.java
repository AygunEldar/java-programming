package saim_only_03_22;
import java.util.Scanner;

public class BadWords {
    public static void main (String [] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the message");
        String text =scan.nextLine();

        if(text.contains("idiot") || text.contains("dumb") ||text.contains("heck")){

            System.out.println("Message is not sent");
        }else{
            System.out.println("Message is sent");
        }


    }
}
