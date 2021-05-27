package officehours04_06;
import java.util.* ;
public class Palindrome {
    public static void main (String [] args ){
      Scanner scan = new Scanner (System.in);
        System.out.println("Enter your word: ");
        String name = scan.next();
      boolean isPalindrome = true;

      for(int i =0; i < name.length()/2; i++){

          if(name.charAt(i) != name.charAt(name.length()-1-i)){
              isPalindrome = false;
              break;
          }

      }
        System.out.println( isPalindrome);
    }
}
