package InterviewTasks;

import java.util.Scanner;

public class Nadir {
    public static void main(String[] args) {
String word = "Washington";
        System.out.println(getLastThree(word));

    }
//
//           // return "WHAT IF IT"S SHORTER???"
//        }
    //public String getLast3Chars(String word) {
    //String result = word.substring(word.length()-3);
    //return result;
//        //}
//        String str ="nadir";
//        System.out.println(getLast_3_Chars(str));


//    public static String getLast_3_Chars(String str){ //ELGUN
//        String result ="";
//        int num = 1;
//        while(num <= 3){
//
//            result += str.charAt(str.length()-num);
//            num++;
//
//        }
//        StringBuilder sb = new StringBuilder(result);
//        sb.reverse();
//        result = sb.toString();
//
//        return result;

    String word;

    public static  String getLastThree(String word) {
        if (word.length() >= 3) {

        }
        return word.substring(word.length() - 3);
    }

}