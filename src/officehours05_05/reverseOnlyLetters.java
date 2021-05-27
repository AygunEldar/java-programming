package officehours05_05;

import java.util.*;

public class reverseOnlyLetters {
    public static void main(String[] args) {

        System.out.println(reverseNoSpec("Ab,c,de!$"));
    }
    public static String reverseNoSpec(String str){

        char [] letters = str.toCharArray();

       // System.out.println(Arrays.toString(letters));

       for(int i=0, j = letters.length-1; i <= letters.length /2; i++){

          if(Character.isLetter(letters[i])){

            for( ; j >= 0; j--){

                if(Character.isLetter(letters[j])){
                    char temp = letters[i];// A
                    letters[i] = letters[j]; // e
                    letters[j--] = temp;
                    break;
                }
            }
    }


  }

       // return Arrays.toString(letters).replace("[","").replace("]","").replace(",","");
        return String.valueOf(letters);
    }




}
