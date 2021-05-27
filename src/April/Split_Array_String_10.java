package April;
import  java.util.*;

public class Split_Array_String_10 {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";

        String [] wordsArr =words.split(":");
        System.out.println(Arrays.toString(wordsArr));

        System.out.println("The length of wordsArray "+wordsArr.length);

        for(String each : wordsArr){
            System.out.print(each +" ");
        }
        System.out.println();
        String sentence ="Today I am coding java arrays";
        String [] sentArr =sentence.split(" ");
        System.out.println(Arrays.toString(sentArr));
        System.out.println(sentence.split(" ")[3]);
        System.out.println(sentArr[3]);
        System.out.println(sentArr.length);

    }
}
