package saim_only_03_30;
import java.util.*;

public class Palindrome {
    public static void main (String [] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String name =scan.next();    //madam
        String rever  = "";


        for(int i=name.length()-1; i >=0 ;i--) {

            rever =rever+ name.charAt(i);
        }

            if (name.equalsIgnoreCase(rever)) {
                System.out.println(true);

            }else{
                System.out.println(false);
            }
//
//        String word = "civic";boolean isPalindrome= true;
//        // Q: What if your String has a million charactersfor
//        for(int i=0; i< word.length()/2; i++) {
//            if(word.charAt(i) != word.charAt(word.length()-1-i)){
//        }
//        {
//            isPalindrome= false;break;
//        }
//        }
//        System.out.println(isPalindrome);


        }
    }

