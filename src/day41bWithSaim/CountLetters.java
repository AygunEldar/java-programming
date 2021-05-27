package day41bWithSaim;
import java.util.*;

public class CountLetters {
    public static void main (String [] args){

        countLetters("apple tree");

        System.out.println();
    }
    public static void countLetters(String str){

        String checked = "";



        for(int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {


                for (int n = 0; n < str.length(); n++) {

                    char eachOtherLetter = str.charAt(n);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }
                System.out.println(eachLetter + " " + count);
                checked += eachLetter;
            }
        }
    }
}
