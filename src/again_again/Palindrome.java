package again_again;
import java.util.*;

public class Palindrome {
    public static void main (String [] args){
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter the word: ");

        String name = scan.next();
        String palin="";
        for(int i =name.length()-1; i >= 0;i--) {
            palin = palin + name.charAt(i);
        }
            if(palin.equalsIgnoreCase(name)){
                System.out.println(true);

            }else{
                System.out.println(false);
            }
        }


    }

