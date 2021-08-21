package interviewTasks_Saim_Strings;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc","cba"));
    }
    public static boolean isAnagram(String word1,String word2){

        word1 = new TreeSet<String>(Arrays.asList(word1.split(""))).toString();
        word2 = new TreeSet<String>(Arrays.asList(word2.split(""))).toString();

        return word1.equals(word2);
    }


}
