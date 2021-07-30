package officehours07_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    /*
    Create a method that will accept a String and returns a String with the duplicate instances of characters removed

Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCCDDD"));
    }
    public static  String removeDuplicate(String str){

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
       set.stream().distinct().toArray();

       //return set.toString();
        //return set.toString(); //[A,B,C,D]
       // return set.toString().replace("[","").replace("]","").replace(",","");//A B C D
        return String.join("",set);
    }
}
