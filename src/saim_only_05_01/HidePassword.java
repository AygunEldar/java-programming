package saim_only_05_01;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main (String [] args){
        String [] password ={"one", "hi", "hold"};
        ArrayList<String>hiddenPassword = new ArrayList<>();

        for(String each : password) {
            hiddenPassword.add(convertToStars(each));

        }
            System.out.println("Original  --> " + Arrays.toString(password));
            System.out.println("hidden    --> " +hiddenPassword);

    }

     public static String convertToStars(String str){

        String stars ="";
        for(int i =0; i< str.length();i++){
            stars +="*";
        }
        return stars;
     }


}
