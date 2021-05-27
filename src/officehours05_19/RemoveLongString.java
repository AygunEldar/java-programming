package officehours05_19;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    /*
    /*
    Remove Long Strings
        This method will accept an ArrayList of Strings and an int. Remove any String elements
        that have less characters than the given number. Return the modified ArrayList of Strings
     */
//        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings
//        Ex: {“one,”, “two”, “three, “four”, “five”, “six”} Max number: 4
//        Output: {“three, “four”, “five”
//     */

    public static void main(String[] args) {
  ArrayList<String>list =new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(removeLongString2(list,4));

    }
    public static ArrayList<String>removeLongString(ArrayList<String> list, int maxLength){

        ArrayList<String>validString = new ArrayList<>();
        for(String word : list){
            if(word.length() < maxLength){
                validString.add(word);
            }
        }
        return validString;
    }

    public static ArrayList<String>removeLongString2(ArrayList<String> list, int maxLength){

        list.removeIf(n->n.length()<maxLength);
        return list;
    }
}
