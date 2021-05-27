package saim_only_05_01;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {

        ArrayList<String> words =new ArrayList<>(Arrays.asList("java","html","css","java",

                "javascript","selenium"));


        int count= 0;
        String target = "java";
        for(String each : words){
            if(each.contains("java")){
                count ++;
            }

        }
        System.out.println("There are "+ count+" "+ target +" in our String");
    }
}
