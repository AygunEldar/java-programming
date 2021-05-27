package saim_only_05_01;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words =new ArrayList<>(Arrays.asList("java","html","css","java",

                "javascript","selenium"));


        int count= 0;
        char letter ='a';
        for(String each : words){
            for(int i =0; i < each.length(); i++){
                if(each.charAt(i)== letter){
                  count ++;
                  //letter += count;
                }
            }

        }
        System.out.println("There are " +count +" "+ letter + " in the given line");
    }


}
