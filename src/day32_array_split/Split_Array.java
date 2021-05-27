package day32_array_split;
import   java.util.*;

public class Split_Array {
    public static void main(String[] args) {

        String words = "java;python;ruby;selenium";
        String[]wordsArray=words.split(";");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length- " + wordsArray.length);

        System.out.println("*******************************");

        String sentence = "today I am coding java arrays ";
        String[]sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));  // in one line
        System.out.println("Length of the sentence "+sentenceArray.length);


        System.out.println("for the first word "+sentenceArray[0]);
        System.out.println("for the first word "+ sentence.split(" ")[0]);
        System.out.println("Number of words in sentence= "+sentenceArray.length);

        for(String each : sentenceArray){  // separate line
            System.out.println(each);
        }

    }

}
