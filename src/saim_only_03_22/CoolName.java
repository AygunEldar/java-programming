package saim_only_03_22;
import java.util.Scanner;

public class CoolName {
    public static void main (String [] args){
         String name;
 Scanner scan =new Scanner(System.in);
 System.out.println("Enter your name");
        name= scan.next();
        if(name.startsWith("a") || name.startsWith("z")){
            System.out.println("Your name is cool");
        }else if(name.endsWith("m")){
            System.out.println("Almost cool");
        }else{
            System.out.println("Sorry, not a cool name");
        }

    }
}
