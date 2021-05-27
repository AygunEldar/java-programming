package saim_only_03_22;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class WordsThree {
    public static void main(String[] args) {

        String word1 ="tomato";
        String word2 ="cucumber";
        String word3 = "eggplant";
        String biggestWordWithA = "";
        if(word1.contains("a")&& word1.length() > biggestWordWithA.length()){
            biggestWordWithA = word1;
        }
        if(word2.contains("a")&& word2.length() > biggestWordWithA.length()){
            biggestWordWithA = word2;
        }

        if(word3.contains("a")&& word3.length() > biggestWordWithA.length()) {
            biggestWordWithA = word3;


        }
        if(biggestWordWithA.isEmpty()){
            System.out.println("None of them contain a");
        }else{
            System.out.println("The longest word with a: " +biggestWordWithA);
        }



    }
}
