package saim_only_03_30;
import java.util.*;

public class UppreLowerNumber {
    public static void main (String [] args){
  Scanner scan= new Scanner(System.in);
  System.out.println("Enter your characters");

        String str = scan.next();
        int upper =0;
        int lower =0;
        int num = 0;

        for(int i =0 ; i < str.length() ;i++) {

            char eachLetter = str.charAt(i);
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lower++;

            } else if (eachLetter >= '0' && eachLetter <= '9') {
                num++;

            }
        }
                System.out.println("Uppercase- " + upper);
                System.out.println("Lowercase- " + lower);
                System.out.println("Numerals - " +num);


    }
}
