package day32_array_split;
import java.util.*;

public class Split_Array_Sentence {
    public static void main(String[] args) {



        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("fisrt word ="+words[0]);
        System.out.println("second word ="+words[1]);
        System.out.println("third word ="+words[2]);

        for(String w : words){
            System.out.println(w);

            String googleResult = "About 1,810,000 results (0.68 seconds)";

            System.out.println(googleResult.split(" ")[1]);
            System.out.println(googleResult.split(" ")[3].substring(1));

            String [] result =googleResult.split(" ");
            System.out.println("count first= " + result[1]);
            System.out.println("Second = "+result [3].replace("(",""));//sane as 21

       }

    }
}
