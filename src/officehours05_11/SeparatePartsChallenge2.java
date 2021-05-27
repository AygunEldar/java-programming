package officehours05_11;

import javax.xml.stream.events.Characters;
import java.util.*;

public class SeparatePartsChallenge2 {
    public static void main (String [] args ){

        String str ="ABCD123$%#@&456EFG!";
        ArrayList<Character> all =new ArrayList<>();

        for(int i = 0; i< str.length(); i++){
            all.add(str.charAt(i));

        }
        ArrayList<Character>letters = new ArrayList<>(all);
        ArrayList<Character>digits = new ArrayList<>(all);
        ArrayList<Character>specials = new ArrayList<>(all);

        letters.removeIf(eachChar -> !Character.isLetter(eachChar));

        digits.removeIf(eachChar -> !Character.isDigit(eachChar));

        specials.removeIf(eachChar -> Character.isDigit(eachChar) || Character.isLetter(eachChar));
        //specials.removeIf(eachChar -> Character.isLetterOrDigit(eachChar));



       // Scanner s = new Scanner (System.in);
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specials);




    }


}
