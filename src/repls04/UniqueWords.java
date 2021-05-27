package repls04;
import java.util.*;

public class UniqueWords {
    public static void main (String [] args){


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
       // String [] words = {"code","java","java","python"};
        for(int i = 0; i < words.length; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        int count = 0;
        for(int n = 0; n < words.length; n++){
             count = 0;

            for(int k = 0; k < words.length; k++){
                if(words[n].equals(words[k]) ){
                    count++;
                }

            }
            if(count == 1){

                System.out.println(words[n]);


            }

        }
    }


}
