package InterviewTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    public static void main(String[] args) {

//        Write a return method that check if a string is build out of the same letters as another string.
//        Ex:  same("abc",  "cab"); -> true
//
//        same("abc",  "abb"); -> false:
        System.out.println(buildSame("abc", "cba"));
    }
        public static boolean buildSame(String a, String b){

       if(a.length() !=b.length()){
           return false;
       }
                a = a.toLowerCase();
                b = b.toLowerCase();

                int [] count = new int [26];
                for(int i =0; i < a.length(); i++){

                    char aLetters =a.charAt(i);
                    char bLetters =b.charAt(i);
                    count[aLetters -97] = count[aLetters -97] + 1;
                    count[bLetters -97] = count[bLetters -97] - 1;
                }
                return true;
    }
//    public static boolean Same(String str1, String str2) {
//
//        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
//
//        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
//
//        return str1.equals(str2);
//    }
}