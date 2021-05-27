package April;
import java.util.*;

public class Palidrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");

        String word = scan.next();
        String palin = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            palin = palin + word.charAt(i);
        }
            if (palin.equalsIgnoreCase(word)) {
                System.out.println("The word is palindrome");
            } else {
                System.out.println("The word is not a palindrome");
            }
        }
    }
