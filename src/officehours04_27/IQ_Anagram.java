package officehours04_27;
import java.util.*;

public class IQ_Anagram {
//    [Anagram]
//
//    Create a method that will accept two Strings. Check if the two
//    Strings are anagram of each other. If they are anagram return true otherwise return false.
//
//    Anagram means the characters of the words are the same, but rearranged in different orders
//
//    For example:
//    listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'

    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));

    }
    //1)toCharArray -> sort -> equal ?
    // 2)loop through one String -> remove the char that you iterate through
    // in the other String -> if empty the second String is empty?

    public static  boolean  isAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();


        int[] count = new int[26];
        // listen -> l+1, i+1, s+1;
        //silent -> s-1, i-1, l-1;

        // a -> 0, b=1, c=2
        // b -> 25

        for (int j = 0; j < one.length(); j++) {

            char letterFromOne = one.charAt(j);
            char letterFromTwo = two.charAt(j);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromOne - 97] - 1;


        }
        return true;
    }

}


