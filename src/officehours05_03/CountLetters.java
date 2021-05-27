package officehours05_03;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));
        char targetLetter ='a';

        int count =0;

        for(String each :words){

          for(int i =0 ; i < each.length(); i++){
              if(each.charAt(i) == targetLetter){
                  count++;
              }
          }
        }
         //     II  version with a custom method

//        for(String each: words){
//            count += letterInWord(each, targetLetter);
//        }
        System.out.println(targetLetter +" was found " + count + " times");
    }

//    public static int letterInWord(String word, char target){
//        int count =0;
//       for(int i = 0; i < word.length();i++){
//           if(word.charAt(i) == target){
//               count ++;
//           }
//
//       }
//       return count;
//   }
   //      III version with acustom method

//    public static int letterInWord(String word, char target){
//        int count =0;
//        for (char each : word.toCharArray()) {
//            if(each == target) count++;
//
//        }
//        return count;
//    }
   }

