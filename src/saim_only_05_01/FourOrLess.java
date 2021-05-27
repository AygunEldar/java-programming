package saim_only_05_01;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {

        ArrayList<String>str =new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal","java", "shortcut"));

         ArrayList<String>words= new ArrayList<>();



            for(String each : str){

                if(each.length() <= 4){
                   words.add(each);
            }

            }

        System.out.println(words);
    }

}
