package july.elgun;

import java.util.Locale;

public class ReplaceAll {
    public static void main(String[] args) {

        readReplaceAll("differenti","i", "o");

    }
    public static void readReplaceAll(String word,String old, String neww){

  String result = "";
        for (int i = 0; i < word.length() ; i+= old.length()) {

            if(word.substring(i, i + old.length()).equals(old)){
                result += neww;
                continue;
            }else{

                result += word.substring( i , i +old.length());
            }

                    }
        System.out.println(result);
    }
}
